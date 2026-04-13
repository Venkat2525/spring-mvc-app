package com.spring.mvc.service;


import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.mvc.data.Employee;
import com.spring.mvc.data.Project;

@Service("employeeDetails")
public class SetEmployeeDetails {

	public static List<Employee> getEmployeeDetails() {
		Project p1 = new Project("Hybis");
		Project p2 = new Project("java");
		Project p3 = new Project("c++");
		Project p4 = new Project("AWS");
		Project p5 = new Project(".Net");

	

		Employee emp1 = new Employee("Venkat", 101, 80000.00, Arrays.asList(p1, p2), "Male","Developer");
		Employee emp2 = new Employee("Vinay", 102, 850000.00, Arrays.asList(p2, p3, p4), "Male","Tester");
		Employee emp3 = new Employee("Harish", 103, 60000.00, Arrays.asList(p5, p3), "Male","Architech");
		Employee emp4 = new Employee("Aditya", 103, 70000.00, Arrays.asList(p4, p5), "Male","Jr Developor");
		Employee emp5 = new Employee("Aashrith", 105, 30000.00, Arrays.asList(p4), "Male","Manager");
		Employee emp6 = new Employee("Aashrith", 105, 30000.00, Arrays.asList(p4), "Male","Developer");
		Employee emp7 = new Employee("Mahima", 103, 70000.00, Arrays.asList(p4, p5), "Female","Jr Developor");
		return Arrays.asList(emp1,emp2,emp3,emp4,emp5,emp6,emp7);
		
	}

}
