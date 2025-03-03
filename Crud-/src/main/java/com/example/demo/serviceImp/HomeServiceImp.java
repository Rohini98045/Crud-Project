package com.example.demo.serviceImp;

import java.util.List;

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



	@Override
	public Iterable<Employee> getAll() {
		return hr.findAll();
	}
	
    @Override
    public List<Employee> getEmployeesSortedBySalaryAsc() {
        return hr.findAllByOrderBySalaryAsc();
    }

    @Override
    public List<Employee> getEmployeesSortedBySalaryDesc() {
        return hr.findAllByOrderBySalaryDesc();
    }
@Override
public void saveData(Employee e) {
	hr.save(e);
}
@Override
public void deleteData(int id) {
hr.deleteById(id);
}
@Override
public Iterable<Employee> loginCheck(String un, String pass) {
	return hr.findAllByUnameAndPassword(un, pass);
}

}
