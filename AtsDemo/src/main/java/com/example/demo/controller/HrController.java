package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ApplicantEntities;
import com.example.demo.model.HrEntities;
import com.example.demo.service.Hrservice;

@RestController
public class HrController {
@Autowired
Hrservice hs;
@PostMapping("addhrinfo")
public List<HrEntities> savehrdata(@RequestBody List<HrEntities> he){
	return hs.savehrinfo(he);
}
@GetMapping("getapplicant/{appid}")
public List<ApplicantEntities> getapplicant(@PathVariable int appid ){
	return hs.getapplicantinfo(appid);
}
@GetMapping("gethrjobid")
public String filljobidbyoffer() {
	hs.filljobidbyoffer();
	return "HR jobId updated";
}
@GetMapping("gethrinfo")
public List<HrEntities> showhrdata(){
	return hs.showhrinfo();
	}
@GetMapping("gethrbycomp/{comp}")
public List<HrEntities> showhrcomp(@PathVariable String comp){
	return hs.getbyhrcomp(comp);
}
@PutMapping("updatehrbyid/{id}")
public String updatehr(@RequestBody HrEntities he,  @PathVariable int id) {
	return hs.updatehrbyid(he,id);
}
@DeleteMapping("deletehr/{id}/{name}")
public int deleteHr(@PathVariable int id,@PathVariable String name) {
	return hs.deleteHr(id, name);
}


}
