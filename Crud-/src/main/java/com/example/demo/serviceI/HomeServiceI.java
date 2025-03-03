package com.example.demo.serviceI;



import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.model.Employee;


public interface HomeServiceI {	
public void deleteData(int id);
public void saveData(Employee e);
Iterable<Employee> getAll();
void addEmployee(Employee e);
public Iterable<Employee> loginCheck(String un,String pass);
}
