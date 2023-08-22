package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.EmpModel;
import com.example.demo.services.EmpService;

@RestController
public class EmpControl {
  @Autowired
  EmpService es;
  @PostMapping("addinfo")
  public EmpModel addinfo(@RequestBody EmpModel ss) {
	  return es.saveinfo(ss);
  }
  @GetMapping("showDetails")
  public List<EmpModel> show(){
	  return es.showInfo();
  }
  
  
}
