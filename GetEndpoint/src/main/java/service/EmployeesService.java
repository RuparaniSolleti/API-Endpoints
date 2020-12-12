package service;

import java.util.ArrayList;


import org.springframework.stereotype.Service;

import model.Employees;
@Service
public class EmployeesService {
	 ArrayList<Employees> employees=new ArrayList<Employees>();
	public EmployeesService() {
		employees.add(new Employees(23,"rupa","07/06/1998","PY/BOM/345***/228***","10/06/2019","abc.xyz@mphasis.com"));
		employees.add(new Employees(26,"hari","09/07/1997","PY/BOM/78***/234***","11/07/2019","wer.fgd@mphasis.com"));
		employees.add(new Employees(22,"sushma","10/12/1995","PY/BOM/098***/123***","15/06/2018","qaz.uio@mphasis.com"));
		employees.add(new Employees(27,"likhitha","09/08/1996","PY/BOM/434***/121***","10/06/2020","asd.jkl@mphasis.com"));
	}
	
	public ArrayList<Employees> getAll(){
		return employees;
	}

	public ArrayList<Employees> getEmployee(int employeeId) {
		
		ArrayList<Employees> employees1=new ArrayList<Employees>();
	        for (Employees e:employees){
	                if(e.getEmployeeId()==employeeId) {
	                employees1.add(e);
	         }
	        }
	    return employees1;
	}
		
	}

	
	

