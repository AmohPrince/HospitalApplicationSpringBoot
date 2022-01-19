package com.hospitalsystem.Hs.sequel;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospitalsystem.Hs.entities.User;

public interface Userrepository extends JpaRepository<User, Integer> {
	Optional<User> findByUserName(String username);

}
