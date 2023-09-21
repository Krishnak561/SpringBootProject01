package com.athena.service;

import java.util.List;

import com.athena.entity.CargoEntity;

public interface CargoService {

	public boolean saveCargo(CargoEntity cEntity);

	public List<CargoEntity> getAllCargo();

	public CargoEntity getsingleCargo(int id);

	public boolean updateCargo(CargoEntity ce);

	public void deleteCargo(int id);
}
