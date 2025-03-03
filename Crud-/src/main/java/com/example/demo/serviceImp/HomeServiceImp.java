package com.example.demo.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
=======
import com.example.demo.model.Employee;
>>>>>>> branch 'main' of https://github.com/Rohini98045/Crud-Project.git
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



	@Autowired
	HomeRepository hr;
	
	@Override
	public void saveData(Employee e) {
		// TODO Auto-generated method stub
		hr.save(e);
	}

}
