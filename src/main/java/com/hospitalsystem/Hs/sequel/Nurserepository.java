package com.hospitalsystem.Hs.sequel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospitalsystem.Hs.entities.Nurse;

@Repository
public interface Nurserepository extends JpaRepository<Nurse, Integer> {

}
