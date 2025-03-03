package com.example.demo.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.HomeRepository;
import com.example.demo.serviceI.HomeServiceI;

@Service
public class HomeServiceImp  implements HomeServiceI{

	@Autowired
	HomeRepository hr;
	@Override
	public void addEmployee(Employee e) {
		hr.save(e);
		
	}



}
