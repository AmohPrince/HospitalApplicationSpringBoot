package com.hospitalsystem.Hs.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Passwords {

	@Id
	int passwords;
	int userId;

	public Passwords() {

	}

	public Passwords(int passwords, int userId) {
		super();
		this.passwords = passwords;
		this.userId = userId;
	}

	public int getPasswords() {
		return passwords;
	}

	public void setPasswords(int passwords) {
		this.passwords = passwords;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}
