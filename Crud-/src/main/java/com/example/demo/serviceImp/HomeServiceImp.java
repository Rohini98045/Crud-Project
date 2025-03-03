package com.example.demo.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.HomeRepository;
import com.example.demo.serviceI.HomeServiceI;

@Service
public class HomeServiceImp  implements HomeServiceI{
@Autowired
HomeRepository hr;

@Override
public void deleteData(int id) {
hr.deleteById(id);
	
}



}
