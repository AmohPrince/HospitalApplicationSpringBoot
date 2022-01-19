package com.hospitalsystem.Hs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller {

	@GetMapping("/") // Accessed by both users and admins.Literaly everyone
	public String home() {
		return ("<h1>Welcome To Hospital Application<h1/>");
	}

	@GetMapping("/User") // Accessed by both users and admin
	public String user() {
		return "<h1>Welcome User</h1>";

	}

	@GetMapping("/Admin")
	public String admin() {
		return "<h1> Welcome Administratot</h1>";

	}
}
