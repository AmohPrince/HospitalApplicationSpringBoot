package com.hospitalsystem.Hs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/addnewnurse")
    public String addNewNurse(@RequestBody Nurse nurse) {
        doctorservice.addNewNurse(nurse);
        return "A new nurse is added";
    }

    @GetMapping("/getallnurses")
    public List<Nurse> getAllNurses(Nurse nurse) {
        return doctorservice.getAllNurses(nurse);

    }

    @RequestMapping(method = RequestMethod.DELETE, value = "{id}")
    public String deleteNurseById(@PathVariable int id) {
        return doctorservice.deleteNurseById(id);

    }

    @GetMapping("/test")
    public String test() {
        return "Doctor Controller is Up";

    }

}
