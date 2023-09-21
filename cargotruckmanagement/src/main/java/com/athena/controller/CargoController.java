package com.athena.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.athena.entity.CargoEntity;
import com.athena.service.impl.CargoServiceImpl;

@Controller
public class CargoController {

	@Autowired
	private CargoServiceImpl cargoServices;

	@RequestMapping("/")
	public String loadForm(Model model) {

		CargoEntity cargo = new CargoEntity();
		model.addAttribute("cargo", cargo);
		return "InsertPage";
	}

	@RequestMapping("/insert")
	public String cargoInsertHandler(@ModelAttribute("cargo") CargoEntity cEntity, Model model) {

		boolean flag = cargoServices.saveCargo(cEntity);
		String msg = "";

		if (flag) {
			msg = "Data Insertion Successfully.";
		} else {
			msg = "Data Insertion Failed!";
		}
		model.addAttribute("msg", msg);
		return "InsertPage";
	}

	@RequestMapping("/viewAll")
	public String viewAllCargo(Model model) {
		// fetch the data from the database
		List<CargoEntity> allCargo = cargoServices.getAllCargo();

		model.addAttribute("cargos", allCargo);
		return "ViewPage";
	}

	@RequestMapping("/deleteCargo")
	public String deleteCargo(@RequestParam("eid") int id) {
		cargoServices.deleteCargo(id);
		return "redirect:/viewAll";
	}

	@RequestMapping("/editCargo")
	public String editCargo(@RequestParam("eid") int id, Model model) {
		CargoEntity cEntity = cargoServices.getsingleCargo(id);

		model.addAttribute("cargo", cEntity);
		return "EditPage";
	}

	@RequestMapping("/update")
	public String updateCargo(CargoEntity cEntity) {
		cargoServices.updateCargo(cEntity);
		return "redirect:/viewAll";
	}

}
