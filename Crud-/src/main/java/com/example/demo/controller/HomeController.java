package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.serviceI.HomeServiceI;

@RestController
public class HomeController {
	
	@Autowired
	HomeServiceI hs;
	
	
	
	
	
	
	
	
	
	
	
	
	@PutMapping("/update/{uid}")
	public String update(@PathVariable("eid")int eid,@RequestBody Employee e) {
	
		hs.saveData(e);
		
		return "Update Success";
		
	}

}
