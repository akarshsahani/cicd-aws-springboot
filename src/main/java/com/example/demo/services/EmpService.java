package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmpRepo;

@Service
public class EmpService {

	@Autowired
	private EmpRepo repo;
	
	public List<Employee> findAllEmp (){
		return repo.findAll();
	}
	
	public Employee findEmpByEmail(String email) {
		return repo.findByEmail(email);
	}
	
	public Employee createEmp (Employee employee) {
		repo.save(employee);
		return repo.findByEmail(employee.getEmail());
	}
}
