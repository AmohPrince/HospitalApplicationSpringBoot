package com.hospitalsystem.Hs.Services;

import java.util.ArrayList;

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

	public boolean checkDocRegStatus(int id) {
		boolean registered = true;

		ArrayList<Object> currentDoctors = new ArrayList<Object>();
		currentDoctors.add(loginrepositorydoctor.findAll());
		// currentdoctors.stream().filter(doctor );

		for (int index = 0; index < currentDoctors.size(); index++) {
			Object Doctor = currentDoctors.get(id);

			if (Doctor != null) {
				registered = true;
				System.out.println(Doctor);
			} else {
				registered = false;
			}
		}
		return registered;
	}

	public boolean checkNurseRegStatus(int id) {
		boolean registered = true;

		ArrayList<Object> currentNurses = new ArrayList<Object>();

		for (int index = 0; index < currentNurses.size(); index++) {
			Object Nurse = currentNurses.get(id);

			if (Nurse != null) {
				registered = true;
				System.out.println(Nurse);
			} else {
				registered = false;
			}
		}

		return registered;

	}

	@Override
	public int setPassword(int id) {

		return 0;
	}

}
