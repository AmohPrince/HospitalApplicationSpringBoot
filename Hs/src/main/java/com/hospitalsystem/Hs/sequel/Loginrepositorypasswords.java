package com.hospitalsystem.Hs.sequel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospitalsystem.Hs.entities.Passwords;

@Repository
public interface Loginrepositorypasswords extends JpaRepository<Passwords, Integer> {

}
