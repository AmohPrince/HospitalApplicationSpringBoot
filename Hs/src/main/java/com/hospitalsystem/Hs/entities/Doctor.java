package com.hospitalsystem.Hs.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Doctor implements Doctorinterface {

	@Id
	private int drid;
	private String name;

	public Doctor() {

	}

	public Doctor(int id, String name) {
		super();
		this.drid = id;
		this.name = name;
	}

	public int getId() {
		return drid;
	}

	public void setId(int id) {
		this.drid = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
