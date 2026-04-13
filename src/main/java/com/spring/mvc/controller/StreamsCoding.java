package com.spring.mvc.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import com.spring.mvc.data.Employee;
import com.spring.mvc.service.SetEmployeeDetails;


public class StreamsCoding {
	
	
	public static void main(String args[])
	{
		List<Employee> employee=   SetEmployeeDetails.getEmployeeDetails();
		
		//  System.out.print(employee);
		
		
	List<Employee>	salaryList =employee.stream().filter(e->e.getSalary() > 50000.00).collect(Collectors.toList());
	
	//salaryList.stream().forEach(e->System.out.println(e.getName() + " "+ e.getSalary()));
	
//	Map<String, Double>	salaryList1 =	employee.stream().filter(e->e.getDept().equals("Developer")).collect(Collectors.toMap(Employee::getName, Employee::getSalary));
//		
//	
//	System.out.println(salaryList1);
//	
//	
//	List<String>	salaryList12 =employee.stream().map(Employee::getDept).distinct().collect(Collectors.toList());
//	
//	System.out.println(salaryList12);
//	
//	System.out.println(employee.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.mapping(Employee::getName, Collectors.toList()))));
//	
	
	Map<String,List<String>> map =new HashMap<>();
	
	
	
	for(Employee ae :employee)
	{
	    map.putIfAbsent(ae.getGender(), new ArrayList<>());
	    
	    map.get(ae.getGender()).add(ae.getName());  
	}
	
	System.out.println(map);
	
	employee.stream().min(Comparator.comparing(Employee::getSalary));
	
	
	//employee.stream().flatMap(e->e.getProjects().stream().forEach(p->System.out.print(p.getName()))));
	}

}
