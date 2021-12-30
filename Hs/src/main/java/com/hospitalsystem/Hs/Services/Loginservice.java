package com.hospitalsystem.Hs.Services;

import com.hospitalsystem.Hs.entities.Doctor;
import com.hospitalsystem.Hs.entities.Nurse;

public interface Loginservice {

	public Doctor addDoctor(Doctor doctor);

	public Nurse addNurse(Nurse nurse);

	public boolean checkNurseRegStatus(int id);

	public boolean checkDocRegStatus(int id);

	public int setPassword(int id);

}
