package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Color {
	@Value("${col}")
	private String colour;
@GetMapping("color")
public String disp() {
	return  "My favourite color is "+colour;
}
}
