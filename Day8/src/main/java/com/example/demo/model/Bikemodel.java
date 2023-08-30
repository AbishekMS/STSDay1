package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="bike")
public class Bikemodel {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int bikeid;
private String regno;
private String ownername;
private String bikename;
private int year;
private String modelname;
public Bikemodel() {
	super();
	// TODO Auto-generated constructor stub
}
public Bikemodel(int bikeid, String regno, String ownername, String bikename, int year, String modelname) {
	super();
	this.bikeid = bikeid;
	this.regno = regno;
	this.ownername = ownername;
	this.bikename = bikename;
	this.year = year;
	this.modelname = modelname;
}
public int getBikeid() {
	return bikeid;
}
public void setBikeid(int bikeid) {
	this.bikeid = bikeid;
}
public String getRegno() {
	return regno;
}
public void setRegno(String regno) {
	this.regno = regno;
}
public String getOwnername() {
	return ownername;
}
public void setOwnername(String ownername) {
	this.ownername = ownername;
}
public String getBikename() {
	return bikename;
}
public void setBikename(String bikename) {
	this.bikename = bikename;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public String getModelname() {
	return modelname;
}
public void setModelname(String modelname) {
	this.modelname = modelname;
}

}
