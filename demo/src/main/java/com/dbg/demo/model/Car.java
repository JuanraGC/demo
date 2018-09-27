package com.dbg.demo.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Car {

	// Atributos
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idCar;

	@ManyToOne (fetch = FetchType.LAZY)
	private User user;
	
	private Integer idCity;
	private String model;

	public Integer getIdCar() {
		return idCar;
	}

	public void setIdCar(Integer idCar) {
		this.idCar = idCar;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getIdCity() {
		return idCity;
	}

	public void setIdCity(Integer idCity) {
		this.idCity = idCity;
	}

}
