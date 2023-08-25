package com.example.demo.model;

//import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Baby")
public class BabyEntity {
	@Id
	
 private int babyid;
	//@Column(name="Fname")
 private String babyfname;
	//@Column(name="Lname")
 private String babylname;
private String fathername;
 private String mothername;
 private String address;
public BabyEntity(int babyid, String babyfname, String babylname, String fathername, String mothername,
		String address) {
	super();
	this.babyid = babyid;
	this.babyfname = babyfname;
	this.babylname = babylname;
	this.fathername = fathername;
	this.mothername = mothername;
	this.address = address;
}
public BabyEntity() {
	super();
	// TODO Auto-generated constructor stub
}
public int getBabyid() {
	return babyid;
}
public void setBabyid(int babyid) {
	this.babyid = babyid;
}
public String getBabyfname() {
	return babyfname;
}
public void setBabyfname(String babyfname) {
	this.babyfname = babyfname;
}
public String getBabylname() {
	return babylname;
}
public void setBabylname(String babylname) {
	this.babylname = babylname;
}
public String getFathername() {
	return fathername;
}
public void setFathername(String fathername) {
	this.fathername = fathername;
}
public String getMothername() {
	return mothername;
}
public void setMothername(String mothername) {
	this.mothername = mothername;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

 
}
