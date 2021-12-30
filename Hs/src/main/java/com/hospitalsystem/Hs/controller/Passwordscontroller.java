package com.hospitalsystem.Hs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hospitalsystem.Hs.Services.Passwordservice;
import com.hospitalsystem.Hs.entities.Passwords;

@RestController
@RequestMapping("/passwords")
public class Passwordscontroller {

	@Autowired
	Passwordservice passwordservice;

	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public String deletePassword(@PathVariable int id) {

		return passwordservice.deletePasswordById(id);

	}

	@PostMapping
	public Passwords createPassword(Passwords password) {
		return passwordservice.createPassword(password);

	}

	@GetMapping("/test")
	public String test() {
		return "Password Controller Is Up";

	}
}
