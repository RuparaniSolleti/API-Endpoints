package controller;


import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	@GetMapping("/employee")
	public ArrayList<Employees> getEmployee(@RequestParam("employeeId") int employeeId) {
		return es.getEmployee(employeeId);
		
	}
}








