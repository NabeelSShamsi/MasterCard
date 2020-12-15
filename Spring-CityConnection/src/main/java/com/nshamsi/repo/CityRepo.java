package com.nshamsi.repo;

import org.springframework.data.repository.CrudRepository;

import com.nshamsi.model.CityConnection;

public interface CityRepo extends CrudRepository <CityConnection, Integer>{
	
	CityConnection findByCity1(String city1);
	CityConnection findByCity2(String city2);

}
