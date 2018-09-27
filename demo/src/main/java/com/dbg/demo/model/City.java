package com.dbg.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public class City {
	
	// Atributos
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idCity;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "city")
	private List<User> users = new ArrayList<>();

	@OneToOne
	private Province province;
	
	private String name;
	
	
	// Getters Setters
	public Integer getIdCity() {
		return idCity;
	}

	public void setIdCity(Integer idCity) {
		this.idCity = idCity;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Province getProvince() {
		return province;
	}

	public void setProvince(Province province) {
		this.province = province;
	}
	
	
}
