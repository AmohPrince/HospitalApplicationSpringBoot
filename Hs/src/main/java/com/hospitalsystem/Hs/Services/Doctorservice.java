package com.hospitalsystem.Hs.Services;

import java.util.List;

import com.hospitalsystem.Hs.entities.Nurse;
import com.hospitalsystem.Hs.entities.Patients;

public interface Doctorservice {

	// get a list of patients
	public List<Patients> getAllPatients(Patients patient);

	// get all nurses
	public List<Nurse> getAllNurses(Nurse nurse);

}
