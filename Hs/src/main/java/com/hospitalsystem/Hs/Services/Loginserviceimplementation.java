package com.hospitalsystem.Hs.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospitalsystem.Hs.entities.Doctor;
import com.hospitalsystem.Hs.entities.Nurse;
import com.hospitalsystem.Hs.sequel.LoginrepositoryDoctor;
import com.hospitalsystem.Hs.sequel.LoginrepositoryNurse;

@Service
public class Loginserviceimplementation implements Loginservice {

	@Autowired
	LoginrepositoryDoctor loginrepositorydoctor;

	@Autowired
	LoginrepositoryNurse loginrepositorynurse;

	public Doctor addDoctor(Doctor doctor) {

		return loginrepositorydoctor.save(doctor);
	}

	public Nurse addNurse(Nurse nurse) {
		return loginrepositorynurse.save(nurse);

	}

	/*
	 * public boolean checkDocRegStatus(int id) {
	 * 
	 * boolean registered = true;
	 * 
	 * ArrayList<Object> currentdoctors = new ArrayList<Object>();
	 * currentdoctors.add(loginrepositorydoctor.findAll());
	 * currentdoctors.stream().filter()
	 * 
	 * }
	 * 
	 * public boolean checkNurseRegStatus(int id) {
	 * 
	 * }
	 */

	// Temporarily saving a doctor
	public Doctor addTempDoctor(Doctor doctor) {

		return loginrepositorydoctor.save(doctor);
	}

	// Temporarily saving a nurse
	public Nurse addTempNurse(Nurse nurse) {

		return loginrepositorynurse.save(nurse);
	}

}
