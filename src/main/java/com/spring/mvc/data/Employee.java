package com.spring.mvc.data;

import java.util.List;

public class Employee {
	
	public String name;
	
    public int Id;
	
	public double salary;
	
	public List<Project> projects;
	
	public String gender;
	
	public String dept;
	

	public Employee(String name,int Id, double salary, List<Project> projects,String gender,String dept)
	{
		this.name =name;
		this.salary=salary;
		this.projects=projects;
		this.dept=dept;
		this.gender=gender;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", Id=" + Id + ", salary=" + salary + ", projects=" + projects + ", gender="
				+ gender + ", dept=" + dept + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
}
