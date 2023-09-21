package com.athena.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.athena.entity.TruckEntity;
import com.athena.repository.TruckRepository;
import com.athena.service.TruckService;

@Service
public class TruckServiceImpl implements TruckService {

	@Autowired
	private TruckRepository truckRepo;

	@Override
	public TruckEntity saveTruck(TruckEntity tEntity) {

		return truckRepo.save(tEntity);

	}

	@Override
	public List<TruckEntity> getAllTruck() {

		return truckRepo.findAll();
	}

	@Override
	public TruckEntity getSingleTruck(int tId) {

		return truckRepo.findById(tId).orElse(null);
	}

	@Override
	public boolean updateTruck(TruckEntity tEntity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void deleteTruck(int tId) {
		// TODO Auto-generated method stub
		truckRepo.deleteById(tId);

	}

}
