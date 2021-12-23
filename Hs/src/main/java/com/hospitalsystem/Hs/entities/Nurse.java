package com.hospitalsystem.Hs.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Nurse implements Nurseinterface {

	@Id
	private int nrid;
	private String name;

	public Nurse() {

	}

	public Nurse(int nrid, String name) {
		super();
		this.nrid = nrid;
		this.name = name;
	}

	public int getNrid() {
		return nrid;
	}

	public void setNrid(int nrid) {
		this.nrid = nrid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
