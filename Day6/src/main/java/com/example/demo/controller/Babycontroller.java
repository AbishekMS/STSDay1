package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.BabyEntity;
import com.example.demo.service.BabyService;

@RestController
public class Babycontroller {
	@Autowired
	BabyService bs;
	@PostMapping("addinfo")
	public List<BabyEntity> addinfo(@RequestBody List<BabyEntity> be){
		return bs.saveinfo(be);
	}
    @GetMapping("showinfo")
    public List<BabyEntity> showinfo(){
    	return bs.showinfo();
    }
    @GetMapping("sort/{name}")
    public List<BabyEntity> sortbyfield(@PathVariable String name){
    	return bs.sortby(name);
    }
    @GetMapping("getbypage/{pageno}/{pagesize}")
    public List<BabyEntity> getpage(@PathVariable int pageno,@PathVariable int pagesize ){
    	return bs.getbypage(pageno, pagesize);
    }
    @GetMapping("sortandpage/{pageno}/{pagesize}/{name}")
    public List<BabyEntity> sortPaging(@PathVariable int pageno,@PathVariable int pagesize,@PathVariable String name){
    	return bs.sortandpage(pageno,pagesize,name);
    }
	
   
}
