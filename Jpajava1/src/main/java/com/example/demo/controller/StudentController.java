package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.StudentEntity;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
   @Autowired
	StudentService  sser;
   @PostMapping("addEntities")
   public StudentEntity add(@RequestBody StudentEntity ss){
	   return sser.saveinfo(ss);
   }
   @PostMapping("addList")
   public List<StudentEntity> addList(@RequestBody List<StudentEntity> ss){
	   return sser.saveList(ss);
   }
   @GetMapping("showDetail")
   public List<StudentEntity> show(){	
	   return  sser.showinfo();
	   }
   @PutMapping("update")
   public StudentEntity modify(@RequestBody StudentEntity ss ) {
	   return sser.changeinfo(ss);
   }
   @DeleteMapping("delete")
   public String del(@RequestBody StudentEntity ss) {
	   sser.deleteinfo(ss);
	   return "Deleted successfully";
   }
   @DeleteMapping("del/{id}")
   public String deleteId(@PathVariable int id) {
	   sser.deleteid(id);
	   return "Deleted successfully by Id";
   }
   @DeleteMapping("deleparaid")
   public String deleteParam(@RequestParam int id) {
   	sser.deleteparamid(id);
   	return "Successfully Deleted by Parameter";
   	}
}
