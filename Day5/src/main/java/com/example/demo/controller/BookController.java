package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.BookEntity;

import com.example.demo.service.BookService;

@RestController
public class BookController {
  @Autowired
  BookService bs;
  @PostMapping("addEntities")
  public List<BookEntity> saveList(@RequestBody List<BookEntity> be){
	  return bs.saveList(be);
  }
  @DeleteMapping("deletebyparam")
  public String deleteID(@RequestParam int id) {
	  bs.deleteParamid(id);
	  return "Successfully deleted by parameter";
  }
  @PutMapping("update/{id}")
  public String changeinfo(@RequestBody  BookEntity be,@PathVariable int id) {
	  return bs.updateInfo(be,id);
  }
  
  @GetMapping("showDetail")
  public List<BookEntity> show(){	
	   return  bs.showinfo();
	   }
  
}
