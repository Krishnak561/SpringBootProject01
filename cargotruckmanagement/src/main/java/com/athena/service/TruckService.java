package com.athena.service;

import java.util.List;

import com.athena.entity.TruckEntity;

public interface TruckService {
	public TruckEntity saveTruck(TruckEntity tEntity);

	public List<TruckEntity> getAllTruck();

	public TruckEntity getSingleTruck(int tId);

	public boolean updateTruck(TruckEntity tEntity);

	public void deleteTruck(int tId);
}
