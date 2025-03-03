package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.serviceImp.HomeServiceImp;

@RestController
public class HomeController {

	@Autowired
	HomeServiceImp hs;
	
	@PostMapping("/save")
	public String postData(@RequestBody Employee e) {
		hs.addEmployee(e);
		return "Data Added Successfully";
	}
}
