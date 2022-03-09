package com.hospitalsystem.Hs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hospitalsystem.Hs.Services.Doctorservice;
import com.hospitalsystem.Hs.Services.nurseservice;
import com.hospitalsystem.Hs.entities.Patients;

@RestController
@RequestMapping("/nurse")
public class Nursecontroller {

    @Autowired
    nurseservice nurseservice;

    @Autowired
    Doctorservice doctorservice;

    @PostMapping("/addpatients")
    public String addpatients(@RequestBody Patients patient) {

        nurseservice.addpatient(patient);
        return "New Patient is added";

    }

    @GetMapping("/getallpatients")
    public List<Patients> getAllPatients(Patients patient) {

        return doctorservice.getAllPatients(patient);

    }
	
    @RequestMapping(method = RequestMethod.DELETE, value = "{id}")
    public String deletePatientById(@PathVariable int id) {
        return nurseservice.deletePatientById(id);
    }

    @GetMapping("/test")
    public String test() {
        return "Nurse Controller Is Up";

    }

}
