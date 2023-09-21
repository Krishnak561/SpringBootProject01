package com.athena.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.athena.entity.CargoEntity;
import com.athena.repository.CargoRepository;
import com.athena.service.CargoService;

@Service
public class CargoServiceImpl implements CargoService {

	@Autowired
	private CargoRepository cargoRepo;

	@Override
	public boolean saveCargo(CargoEntity cEntity) {
		// interacting with Database
		CargoEntity cargoSave = cargoRepo.save(cEntity);
		boolean flag = false;
		if (cargoSave != null)
			flag = true;
		return flag;

	}

	@Override
	public List<CargoEntity> getAllCargo() {
		// TODO Auto-generated method stub

		// Select * from cargo;

		List<CargoEntity> cargoRecords = cargoRepo.findAll();

		return cargoRecords;
	}

	@Override
	public CargoEntity getsingleCargo(int id) {
		Optional<CargoEntity> cargoRecordID = cargoRepo.findById(id);
		CargoEntity cEntity = cargoRecordID.get();
		return cEntity;
	}

	@Override
	public boolean updateCargo(CargoEntity ce) {
		return saveCargo(ce);
	}

	@Override
	public void deleteCargo(int id) {
		cargoRepo.deleteById(id);

	}

}
