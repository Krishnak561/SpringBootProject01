package com.athena.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.athena.entity.TruckEntity;

@Repository
public interface TruckRepository extends JpaRepository<TruckEntity, Integer> {

}
