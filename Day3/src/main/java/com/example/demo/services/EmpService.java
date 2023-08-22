package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.EmpModel;
import com.example.demo.repository.EmpRespos;

@Service
public class EmpService {
  @Autowired
  EmpRespos erp;
   	public EmpModel saveinfo(EmpModel emp) {
   		return erp.save(emp);
   	}
   	public List<EmpModel> showInfo(){
   		return erp.findAll();
   	}
}
