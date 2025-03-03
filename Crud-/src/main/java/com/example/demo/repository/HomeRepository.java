package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;


@Repository
public interface HomeRepository extends CrudRepository<Employee, Integer>{


	@Query("select e from Employee e where e.salary=(select max(e2.salary) from Employee e2)")
	List<Employee> findEmployeeWithHighSalary();
	
	@Query("select e from Employee e where e.salary=(select min(e2.salary) from Employee e2)")
	List<Employee> findEmployeeWithLowSalary();

public Iterable<Employee> findAllByUnameAndPassword(String uname,String password);
    List<Employee> findAllByOrderBySalaryAsc();
    List<Employee> findAllByOrderBySalaryDesc();

    @Query("SELECT AVG(e.salary) FROM Employee e")
	Iterable<Employee> getAverageSalary();


	
}
