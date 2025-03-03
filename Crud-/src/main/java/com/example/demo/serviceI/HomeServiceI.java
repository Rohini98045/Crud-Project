package com.example.demo.serviceI;


import com.example.demo.model.Employee;


public interface HomeServiceI {	
public void deleteData(int id);
public void saveData(Employee e);


	Iterable<Employee> getAll();

}
