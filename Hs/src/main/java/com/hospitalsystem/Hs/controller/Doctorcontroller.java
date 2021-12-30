package com.hospitalsystem.Hs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospitalsystem.Hs.Services.Doctorservice;
import com.hospitalsystem.Hs.entities.Nurse;
import com.hospitalsystem.Hs.entities.Patients;

@RestController
@RequestMapping("/doctor")
public class Doctorcontroller {

	@Autowired
	Doctorservice doctorservice;

	@GetMapping("/getallpatients")
	public List<Patients> getallpatients(Patients patient) {

		return doctorservice.getAllPatients(patient);
	}

	@GetMapping("/getallnurses")
	public List<Nurse> getAllNurses(Nurse nurse) {
		return doctorservice.getAllNurses(nurse);

	}

	@GetMapping("/test")
	public String test() {
		return "Doctor Controller is Up";

	}

}
