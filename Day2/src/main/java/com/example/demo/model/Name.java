package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class Name {
	@JsonIgnoreProperties
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Name(String name) {
		super();
		this.name = name;
	}

	public Name() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

}
