package com.sam;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	int id;
	String name;

	public Employee() {
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
