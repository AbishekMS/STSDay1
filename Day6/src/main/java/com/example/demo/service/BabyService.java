package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.BabyEntity;
import com.example.demo.repository.BabyRepos;

@Service
public class BabyService {
@Autowired
BabyRepos br;
public List<BabyEntity> saveinfo(List<BabyEntity> be){
	return br.saveAll(be);
}
public List<BabyEntity> showinfo(){
	return br.findAll();
}
public List<BabyEntity> sortby(String bn){
	return br.findAll(Sort.by(bn).descending());
}
public List<BabyEntity> getbypage(int pgno,int pgsize){
	Page<BabyEntity> page=br.findAll(PageRequest.of(pgno,pgsize));
	return page.getContent();
	}
public List<BabyEntity> sortandpage(int pageno,int pagesize,String field){
	Page<BabyEntity> page = br.findAll(PageRequest.of(pageno, pagesize, Sort.by(field)));
    List<BabyEntity> entities = page.getContent();
    return entities;
	
	
}
}
