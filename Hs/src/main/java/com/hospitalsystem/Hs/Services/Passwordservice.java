package com.hospitalsystem.Hs.Services;

import com.hospitalsystem.Hs.entities.Passwords;

public interface Passwordservice {

	public Passwords createPassword(Passwords password);

	public String deletePasswordById(int id);

}
