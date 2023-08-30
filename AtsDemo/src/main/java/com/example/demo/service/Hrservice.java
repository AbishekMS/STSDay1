package com.example.demo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.ApplicantEntities;
import com.example.demo.model.HrEntities;
import com.example.demo.model.JobVacancyEntities;
import com.example.demo.repository.HrRepos;
import com.example.demo.repository.JobVacancyRepos;

import jakarta.transaction.Transactional;

@Service
public class Hrservice {
 @Autowired
 HrRepos hr;
 @Autowired
 JobVacancyRepos jr;
 @Transactional
 public void filljobidbyoffer() {
	 List<HrEntities> he=hr.findAll();
	 List<JobVacancyEntities> je=jr.findAll();
	 for(HrEntities h:he) {
		 for(JobVacancyEntities job:je) {
			 if(offersmatch(job.getJobDescription(),h.getOffers())) {
				 h.setJobid(job.getJobId());
				 break;
			 }
		 }
	 }
 }
 private boolean offersmatch(String description,String offers) {
	 if(description.equalsIgnoreCase(offers)) {
		 return true;
	 }
	 return false;
 }
 @Transactional
 public List<ApplicantEntities> getapplicantinfo(int id){
	 return hr.findapplicants(id);
 }
 public List<HrEntities> savehrinfo(List<HrEntities> he){
	 return hr.saveAll(he);
 }
 public List<HrEntities> showhrinfo(){
	 return hr.findAll();
 }
 public List<HrEntities> getbyhrcomp(String comp){
	 return hr.getbycomp(comp);
 }
public String updatehrbyid(HrEntities he, int id) {
	if(hr.existsById(id)) {
		hr.saveAndFlush(he);
		return "Updated successfully";
	}
	return "HR not exist";
}
public int deleteHr(int id,String name) {
	return hr.deletehr(id, name);
}

}

