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

import com.example.demo.model.Bikemodel;
import com.example.demo.service.Bikeservice;

@RestController
public class Bikecontroller {

	@Autowired
	Bikeservice bs;
	@GetMapping("getbikes")
	public List<Bikemodel> disp(){
		return bs.getBikes();
	}
	@PostMapping("addbikes")
	public List<Bikemodel> addbikes(@RequestBody List<Bikemodel> bm){
		return bs.addBike(bm);
	}
	@GetMapping("getbikebyname/{name}")
	public List<Bikemodel> getbyname(@PathVariable String name){
		return bs.getbyname(name);
	}
	@GetMapping("getbybike/{bike}")
	public List<Bikemodel> getbike(@PathVariable String bike){
		return bs.getbybike(bike);
	}
	@PutMapping("updateyr/{yr}/{mn}")
	public String updatebikeyear(@PathVariable int yr,@PathVariable String mn) {
		return bs.updateyear(yr, mn);
	}
	@DeleteMapping("delete/{regno}/{yr}")
	public String del(@PathVariable int regno,@PathVariable int yr) {
		return bs.deletereg(regno,yr)+"deleted";
	}
}
