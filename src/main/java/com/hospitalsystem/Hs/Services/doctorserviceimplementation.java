package com.hospitalsystem.Hs.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospitalsystem.Hs.entities.Nurse;
import com.hospitalsystem.Hs.entities.Patients;
import com.hospitalsystem.Hs.sequel.Nurserepository;
import com.hospitalsystem.Hs.sequel.Patientrepository;

@Service
public class doctorserviceimplementation implements Doctorservice {

	@Autowired
	Patientrepository patientrepository;

	@Autowired
	Nurserepository nurserepository;

	// Return a list of all patients
	public List<Patients> getAllPatients(Patients patient) {

		return patientrepository.findAll();
	}

	// Add a new nurse

	@Override
	public List<Nurse> getAllNurses(Nurse nurse) {

		return nurserepository.findAll();
	}

	@Override
	public Nurse addNewNurse(Nurse nurse) {
		return nurserepository.save(nurse);
	}

	@Override
	public String deleteNurseById(int id) {
		nurserepository.deleteById(id);

		return "deleted Nurse of id " + id;
	}

}
