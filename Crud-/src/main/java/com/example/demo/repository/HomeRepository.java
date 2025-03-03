package com.example.demo.repository;

import java.util.List;

<<<<<<< HEAD
import org.springframework.data.jpa.repository.Query;
=======
>>>>>>> branch 'main' of https://github.com/Rohini98045/Crud-Project.git
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;


@Repository
public interface HomeRepository extends CrudRepository<Employee, Integer>{

<<<<<<< HEAD
public Iterable<Employee> findAllByUnameAndPassword(String uname,String password);

=======
    List<Employee> findAllByOrderBySalaryAsc();
    List<Employee> findAllByOrderBySalaryDesc();
>>>>>>> branch 'main' of https://github.com/Rohini98045/Crud-Project.git


}
