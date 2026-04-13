package com.spring.mvc.controller;

public class Movies {
	
	private String name;
	
	private double rating;
	
	private boolean hdAvailable;
	
	Movies(String name, double rating, boolean hdAvailable)
	{
		this.name=name;
		this.rating=rating;
		this.hdAvailable=hdAvailable;
	}

	@Override
	public String toString() {
		return "Movies [name=" + name + ", rating=" + rating + ", hdAvailable=" + hdAvailable + "]";
	}
	
}
