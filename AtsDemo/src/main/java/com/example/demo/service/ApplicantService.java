package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import com.example.demo.model.ApplicantEntities;
import com.example.demo.repository.ApplicantRepos;

@Service
public class ApplicantService {
 @Autowired
 ApplicantRepos ar;

 public List<ApplicantEntities> saveinfo(List<ApplicantEntities> al){
	 return ar.saveAll(al);
 }
 public List<ApplicantEntities> showinfo(){
	 return ar.findAll();
 }
 public String updateinfobyid(ApplicantEntities ae,int applicantId) {
	 ar.saveAndFlush(ae);
	 if(ar.existsById(applicantId)) {
		 return "Updated Successfully";
	 }
	 else return "Save your Information to update";
	
 }
 public String updateinfobyparam(ApplicantEntities ae,int id) {
		Optional<ApplicantEntities> applicantInformation = ar.findById(id);
		if(applicantInformation.isPresent()) {
			ApplicantEntities ea = applicantInformation.get();
			ea.setAddress(ae.getAddress());
			ea.setCgpa(ae.getCgpa());
			ea.setEmail(ae.getEmail());
			ea.setJobExperience(ae.getJobExperience());
			ea.setContactNo(ae.getContactNo());
			ea.setQualification(ae.getQualification());
			ea.setName(ae.getName());
			ar.saveAndFlush(ea);
			return ("Data is found");
		}else {
			return ("Data is Not Available");
		}
		
	}
 public String deleteinfo(int id) {
	ApplicantEntities as = ar.findById(id).orElse(null);
	 if(as!=null) {
		 ar.delete(as);
		 return "Applicant Id no:"+id+" ,deleted successfully";
	 }
	 else return "Invalid id";
 }


public Optional<ApplicantEntities> showbyid(int id) {
	
	return ar.findById(id);
}
public void deletebybody(ApplicantEntities ae) {
	// TODO Auto-generated method stub
	ar.delete(ae);
	
}
public ApplicantEntities updatebybody(ApplicantEntities ae) {
	// TODO Auto-generated method stub
	return ar.saveAndFlush(ae);
	
}

}
