package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.serviceI.HomeServiceI;

@RestController
public class HomeController {
@Autowired
HomeServiceI hs;
	
	
	
	
@DeleteMapping("/deleteData/id")
public String deleteData(@PathVariable("id")int id) {
hs.deleteData(id);
return "deleted successfully";
}
}
