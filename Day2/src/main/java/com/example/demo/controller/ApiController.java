package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Name;

@RestController
public class ApiController {
	@GetMapping("show")
	public Name info(){
		return new Name("abi");
	}
}
