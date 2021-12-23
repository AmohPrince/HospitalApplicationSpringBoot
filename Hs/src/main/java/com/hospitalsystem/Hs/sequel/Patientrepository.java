package com.hospitalsystem.Hs.sequel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospitalsystem.Hs.entities.Patients;

@Repository
public interface Patientrepository extends JpaRepository<Patients, Integer> {

}
