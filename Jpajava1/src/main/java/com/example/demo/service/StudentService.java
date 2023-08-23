package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.StudentEntity;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentService {
	@Autowired
  StudentRepo sr;//save data from entity(model) to database(repository)
	public StudentEntity saveinfo(StudentEntity ss) {
		return sr.save(ss);
	}
	public List<StudentEntity>showinfo(){
		return sr.findAll();
	}
	public StudentEntity changeinfo(StudentEntity ss) {
		return sr.saveAndFlush(ss);
	}
	public void deleteinfo(StudentEntity ss) {
		 sr.delete(ss);
	}
	public void deleteid(int id) {
		sr.deleteById(id);
	}
	
	public List<StudentEntity> saveList(List<StudentEntity> ss) {
		
		return sr.saveAll(ss);
	}
	public void deleteparamid(int id) {
		sr.deleteById(id);
		
	}
}
