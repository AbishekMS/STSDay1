package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.BookEntity;
import com.example.demo.repository.BookRepos;

@Service
public class BookService {

	@Autowired
	BookRepos br;
	public List<BookEntity> saveList(List<BookEntity> ss){
		return br.saveAll(ss);
	}
	public String updateInfo(BookEntity bl, int id) {
		 br.saveAndFlush(bl);
		if(br.existsById(id)) {
			 return "Updated";
		 }
		 else {
			 return "Invalid input";
		 }
	}
	public void deleteParamid(int id) {
	     br.deleteById(id);
	}
	public List<BookEntity> showinfo(){
		return br.findAll();
	}
}
