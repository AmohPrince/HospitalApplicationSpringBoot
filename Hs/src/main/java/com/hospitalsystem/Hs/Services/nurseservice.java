package com.hospitalsystem.Hs.Services;

import com.hospitalsystem.Hs.entities.Patients;

public interface nurseservice {

	public Patients addpatient(Patients patient);

	public String deletePatientById(int id);

}
