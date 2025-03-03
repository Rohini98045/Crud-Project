package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.serviceI.HomeServiceI;


@RestController
public class HomeController {

	@Autowired
	HomeServiceI hs;

	public Iterable<Employee> getAllEmp(){
		return hs.getAll();
	}
	
	

}
