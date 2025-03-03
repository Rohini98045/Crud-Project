package com.example.demo.serviceI;



import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import com.example.demo.model.Employee;


public interface HomeServiceI {	
public void deleteData(int id);
public void saveData(Employee e);
Iterable<Employee> getAll();	
List<Employee> getEmployeesSortedBySalaryAsc();
List<Employee> getEmployeesSortedBySalaryDesc();
void addEmployee(Employee e);

List<Employee> getEmpMaxSalary();
List<Employee> getEmpMinSalary();

public Iterable<Employee> loginCheck(String un,String pass);
public Iterable<Employee> avrSal();

}
