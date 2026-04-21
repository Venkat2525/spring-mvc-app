package com.spring.mvc.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mvc.data.Employee;
import com.spring.mvc.service.SetEmployeeDetails;

@Controller
public class FirstApplication {
	
	@Autowired
	private SetEmployeeDetails employeeDetails;
  
  @GetMapping("/home")
  @ResponseBody
  public String getHomeData() {
	  
    System.out.println("Hello");
    
   List<Employee> employee=   employeeDetails.getEmployeeDetails();
   
   employee.stream().forEach(System.out::println);
   
   System.out.println("********************************************");
   
   employee = Collections.EMPTY_LIST;
   
   employee.get(0).getName();
   
   
   System.out.println("welcome");
   
   
    return "welcome";  
  }
}