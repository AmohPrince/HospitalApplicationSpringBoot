package com.hospitalsystem.Hs.sequel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospitalsystem.Hs.entities.Doctor;

@Repository
public interface Doctorrepository extends JpaRepository<Doctor, Integer> {

}
