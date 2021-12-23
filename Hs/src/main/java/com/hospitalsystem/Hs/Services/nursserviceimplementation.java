package com.hospitalsystem.Hs.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospitalsystem.Hs.entities.Patients;
import com.hospitalsystem.Hs.sequel.Patientrepository;

@Service
public class nursserviceimplementation implements nurseservice {

	@Autowired
	Patientrepository patientrepository;

	public Patients addpatient(Patients patient) {

		return patientrepository.save(patient);

	}

}
