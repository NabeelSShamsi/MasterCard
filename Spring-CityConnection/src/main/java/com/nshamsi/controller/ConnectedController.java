package com.nshamsi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nshamsi.model.CityConnection;
import com.nshamsi.repo.CityRepo;

@Controller 
public class ConnectedController {
	
	@Autowired
	CityRepo crepo;
	
	@RequestMapping("connected")
	@ResponseBody
	public String connected(@RequestParam String city1,@RequestParam String city2) {
		
		CityConnection c1A = crepo.findByCity1(city1);
		CityConnection c1B = crepo.findByCity2(city1);
		CityConnection c2A = crepo.findByCity1(city2);
		CityConnection c2B = crepo.findByCity2(city2);
		
		if ((c1A == null && c1B == null) || (c2A == null && c2B == null) )
			return "No!";
		
		else if ((c1A.getConnectionId() == c2A.getConnectionId()) || (c1A.getConnectionId() == c2B.getConnectionId()) || 
				(c1B.getConnectionId() == c2A.getConnectionId()) || (c1B.getConnectionId() == c2B.getConnectionId()))
			return "Yes!";
		
		else if ((c1A.getCity2() == c2A.getCity2()) || (c1A.getCity2() == c2B.getCity1()) ||
				(c1B.getCity1() == c2A.getCity2()) || (c1B.getCity1() == c2B.getCity1()))
			return "Yes!";
		else
			return "No!";
				
	}

}
