package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
=======
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
>>>>>>> branch 'main' of https://github.com/Rohini98045/Crud-Project.git
import org.springframework.web.bind.annotation.RestController;

<<<<<<< HEAD
=======
import com.example.demo.model.Employee;
>>>>>>> branch 'main' of https://github.com/Rohini98045/Crud-Project.git
import com.example.demo.serviceI.HomeServiceI;

@RestController
public class HomeController {
<<<<<<< HEAD
@Autowired
HomeServiceI hs;
	
	
	
	
@DeleteMapping("/deleteData/id")
public String deleteData(@PathVariable("id")int id) {
hs.deleteData(id);
return "deleted successfully";
}
=======
	
	@Autowired
	HomeServiceI hs;
	
	
	
	
	
	
	
	
	
	
	
	
	@PutMapping("/update/{uid}")
	public String update(@PathVariable("eid")int eid,@RequestBody Employee e) {
	
		hs.saveData(e);
		
		return "Update Success";
		
	}

>>>>>>> branch 'main' of https://github.com/Rohini98045/Crud-Project.git
}
