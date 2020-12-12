package controller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import model.Employees;
import service.EmployeesService;

@RestController
public class EmployeesController {
	
	@Autowired
	EmployeesService es;
	
	@RequestMapping("/employees")
	public ArrayList<Employees> getAll(){
		return es.getAll();
	}
	@GetMapping("/employees/employeeId/{id}")
	public ArrayList<Employees> getEmployee(@PathVariable(value="id") int employeeId) {
		return es.getEmployee(employeeId);
		
	}
}








