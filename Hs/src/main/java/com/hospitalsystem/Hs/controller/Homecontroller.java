package com.hospitalsystem.Hs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller {

	@GetMapping("/")
	public String home() {
		return ("<h1>Welcome To Hospital Application<h1/>");
	}

}
