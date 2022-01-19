package com.hospitalsystem.Hs.sequel;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospitalsystem.Hs.entities.Users;

public interface Userrepository extends JpaRepository<Users, Integer> {
	Optional<Users> findByUserName(String userName);

}
