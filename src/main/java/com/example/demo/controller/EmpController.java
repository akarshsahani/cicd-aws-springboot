package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.services.EmpService;

@RestController
public class EmpController {

	@Autowired
	private EmpService service;
	
	@GetMapping("/")
	public List<Employee> allEmp(){
		return service.findAllEmp();
	}
	
	@GetMapping("/emp")
	public Employee empByEmail(@RequestParam String email) {
		return service.findEmpByEmail(email);
	}
	
	@PostMapping("/new-emp")
	public Employee newEmp(@RequestBody Employee employee) {
		return service.createEmp(employee);
	}
}
