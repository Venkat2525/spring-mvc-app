package com.spring.mvc.data;

public class Project {
	
	public String name;
	
	public Project(String name)
	{
		this.name=name;
	}

	@Override
	public String toString() {
		return "Project [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
