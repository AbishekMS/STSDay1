package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ApplicantEntities;
import com.example.demo.service.ApplicantService;

@RestController
public class ApplicantController {
@Autowired
ApplicantService as;
@PostMapping("addinfo")
public List<ApplicantEntities> add(@RequestBody List<ApplicantEntities> al){
	return as.saveinfo(al);
}
@GetMapping("showDetail") 
public List<ApplicantEntities> show(){
	return as.showinfo();
	}

@PutMapping("updatebyid")
public String update(@RequestBody ApplicantEntities ae,@RequestParam int applicantId) {
	return  as.updateinfobyid(ae,applicantId);
}

@PutMapping("updatebody")
public ApplicantEntities updatebody(@RequestBody ApplicantEntities ae) {
	return as.updatebybody(ae);
}
@PutMapping("updatebyparam")
public String updatebyparam(@RequestBody ApplicantEntities ae, @RequestParam int id) {
	return as.updateinfobyparam(ae,id);
}
@DeleteMapping("delete/{id}")
public String delete(@PathVariable int id) {
	 return as.deleteinfo(id);
	 
}
@DeleteMapping("deletebybody")
public List<ApplicantEntities> deletebody(@RequestBody ApplicantEntities ae){
	as.deletebybody(ae);
	return as.showinfo();
	}
@GetMapping("showbyid")
public Optional<ApplicantEntities> showByid(@RequestParam int id) {
	return as.showbyid(id);
}
}
