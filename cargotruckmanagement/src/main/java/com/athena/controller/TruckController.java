package com.athena.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.athena.entity.TruckEntity;
import com.athena.service.impl.TruckServiceImpl;

//http://localhost:8090/trucks
@RestController
@RequestMapping("/trucks")
public class TruckController {

	@Autowired
	private TruckServiceImpl truckServices;

	@PostMapping("/insertTruck")
	public TruckEntity insertTruck(@RequestBody TruckEntity book) {
		return truckServices.saveTruck(book);
	}

	@GetMapping("/viewAllTrucks")
	public List<TruckEntity> getAllTrucks() {
		return truckServices.getAllTruck();
	}

	@GetMapping("/viewSingleTruck/id={tIdNo}")
	public TruckEntity getSingleTruck(@PathVariable int tIdNo) {
		return truckServices.getSingleTruck(tIdNo);
	}

	@GetMapping("/deleteTruck/id={tIdNo}")
	public void deleteTruck(@PathVariable int tIdNo) {
		truckServices.deleteTruck(tIdNo);
	}

}
