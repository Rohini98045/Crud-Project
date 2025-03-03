package com.example.demo.serviceI;



import java.util.List;

import com.example.demo.model.Employee;


public interface HomeServiceI {	
public void deleteData(int id);
public void saveData(Employee e);
Iterable<Employee> getAll();	
List<Employee> getEmployeesSortedBySalaryAsc();
List<Employee> getEmployeesSortedBySalaryDesc();
void addEmployee(Employee e);
public Iterable<Employee> loginCheck(String un,String pass);
}
