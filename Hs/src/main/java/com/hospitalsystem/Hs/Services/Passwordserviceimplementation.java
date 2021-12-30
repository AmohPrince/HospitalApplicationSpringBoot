package com.hospitalsystem.Hs.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospitalsystem.Hs.entities.Passwords;
import com.hospitalsystem.Hs.sequel.Loginrepositorypasswords;

@Service
public class Passwordserviceimplementation implements Passwordservice {

	@Autowired
	Loginrepositorypasswords loginrepositorypasswords;

	public Passwords createPassword(Passwords password) {

		return loginrepositorypasswords.save(password);
	}

	public String deletePasswordById(int id) {

		loginrepositorypasswords.deleteById(id);

		return "A credential has been deleted";
	}

}
