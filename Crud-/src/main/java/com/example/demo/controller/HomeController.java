package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Employee;
import com.example.demo.serviceI.HomeServiceI;

import com.example.demo.model.Employee;
import com.example.demo.serviceImp.HomeServiceImp;

@RestController
public class HomeController {
	
@Autowired
HomeServiceI hs;

@PutMapping("/update/{eid}")
public String update(@PathVariable("eid")int eid,@RequestBody Employee e) {
hs.saveData(e);
return "Update Success";		
}

@DeleteMapping("/deleteData/{id}")
public String deleteData(@PathVariable("id")int id) {
hs.deleteData(id);
return "deleted successfully";
}

	
	@PostMapping("/save")
	public String postData(@RequestBody Employee e) {
		hs.addEmployee(e);
		return "Data Added Successfully";
	}
}
