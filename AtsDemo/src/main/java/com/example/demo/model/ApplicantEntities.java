package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Applicant")
public class ApplicantEntities {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
 private int applicantId;
	//@Column(name="Name")
 private String name;
	
 private String qualification;
	
 private float cgpa;
	@Column(name="WORK_EXP")
 private String jobExperience;
	
 private String email;
	
 private String address;
	
 private long contactNo;
public ApplicantEntities(int applicantId, String name, String qualification, float cgpa, String jobExperience,
		String email, String address, long contactNo) {
	super();
	this.applicantId = applicantId;
	this.name = name;
	this.qualification = qualification;
	this.cgpa = cgpa;
	this.jobExperience = jobExperience;
	this.email = email;
	this.address = address;
	this.contactNo = contactNo;
}
public ApplicantEntities() {
	super();
	// TODO Auto-generated constructor stub
}
public int getApplicantId() {
	return applicantId;
}
public void setApplicantId(int applicantId) {
	this.applicantId = applicantId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getQualification() {
	return qualification;
}
public void setQualification(String qualification) {
	this.qualification = qualification;
}
public float getCgpa() {
	return cgpa;
}
public void setCgpa(float cgpa) {
	this.cgpa = cgpa;
}
public String getJobExperience() {
	return jobExperience;
}
public void setJobExperience(String jobExperience) {
	this.jobExperience = jobExperience;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public long getContactNo() {
	return contactNo;
}
public void setContactNo(long contactNo) {
	this.contactNo = contactNo;
}
 
}
