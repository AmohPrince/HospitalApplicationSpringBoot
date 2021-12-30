package com.hospitalsystem.Hs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospitalsystem.Hs.Services.Loginservice;
import com.hospitalsystem.Hs.entities.Doctor;
import com.hospitalsystem.Hs.entities.Nurse;

@RestController
@RequestMapping("/login")
public class Logincontroller {

	// Register system user first time

	@Autowired
	Loginservice loginservice;

	// check doctor reg status
	@GetMapping("/checkdoctor/{id}")
	public boolean docdetailCheck(@PathVariable int id) {
		boolean x = loginservice.checkDocRegStatus(id);

		boolean regStatus = false;

		if (x = true) {
			regStatus = true;

		} else {
			regStatus = false;

		}
		return regStatus;
	}

	// check nurse reg status
	public boolean NursedetailCheck(@PathVariable int id) {
		boolean x = loginservice.checkNurseRegStatus(id);

		boolean regStatus = false;

		if (x = true) {
			regStatus = true;

		} else {
			regStatus = false;

		}
		return regStatus;
	}

	// send doctor data
	@PostMapping("/doctordata")
	public Doctor addDoctor(@RequestBody Doctor doctor) {

		return loginservice.addDoctor(doctor);

	}

	// send nurse data
	@PostMapping("/nursedata")
	public Nurse addNurse(@RequestBody Nurse nurse) {
		return loginservice.addNurse(nurse);

	}

	@GetMapping("/test")
	public String test() {
		return "Login Controller Is Up";

	}

}
