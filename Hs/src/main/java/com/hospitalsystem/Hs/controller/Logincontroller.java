package com.hospitalsystem.Hs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospitalsystem.Hs.Services.Loginservice;

@RestController
@RequestMapping("/login")
public abstract class Logincontroller {

	// Register system user first time

	@Autowired
	Loginservice loginservice;

	// Check if the user is already registered
	@RequestMapping("/check")
	public String detailsCheck(int id) {

		return "True";

	}

}
