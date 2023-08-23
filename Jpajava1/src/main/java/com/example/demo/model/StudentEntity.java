package com.example.demo.model;

import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student_table")
public class StudentEntity {
	@Id
	//@GeneratedValue(strategy = GenerationType.SEQUENCE)
  private int id;
  private String name;	
  private String departmentName;
  private String mailId;
public StudentEntity(int id, String name, String departmentName, String mailId) {
	super();
	this.id = id;
	this.name = name;
	this.departmentName = departmentName;
	this.mailId = mailId;
}
public StudentEntity() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDepartmentName() {
	return departmentName;
}
public void setDepartmentName(String departmentName) {
	this.departmentName = departmentName;
}
public String getMailId() {
	return mailId;
}
public void setMailId(String mailId) {
	this.mailId = mailId;
}


  
}
