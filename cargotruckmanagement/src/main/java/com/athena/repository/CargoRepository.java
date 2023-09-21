package com.athena.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import com.athena.entity.CargoEntity;

@Repository
public interface CargoRepository extends JpaRepository<CargoEntity, Integer>{

}
