package com.example.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;


@Repository
public interface HomeRepository extends CrudRepository<Employee, Integer>{

public Iterable<Employee> findAllByUnameAndPassword(String uname,String password);
    List<Employee> findAllByOrderBySalaryAsc();
    List<Employee> findAllByOrderBySalaryDesc();


}
