package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Bikemodel;
import com.example.demo.repository.BikeRepos;

@Service
public class Bikeservice {
@Autowired 
BikeRepos br;

public List<Bikemodel> getBikes() {
	// TODO Auto-generated method stub
	return br.findAll();
}

public List<Bikemodel> addBike(List<Bikemodel> bm) {
	// TODO Auto-generated method stub
	return br.saveAll(bm);
}

public List<Bikemodel> getbyname(String name) {
	// TODO Auto-generated method stub
	return br.findbyname(name);
}

public List<Bikemodel> getbybike(String bike) {
	// TODO Auto-generated method stub
	return br.findbybike(bike);
}
public String updateyear(int yr,String mn) {
	return br.updateyr(yr, mn)+"updated";
}

public int deletereg(int regno, int yr) {
	// TODO Auto-generated method stub
	return br.delete(regno, yr);
}

	
}
