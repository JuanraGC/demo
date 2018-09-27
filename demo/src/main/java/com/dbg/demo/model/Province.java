package com.dbg.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Province {
	
	// Atributos
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idProvincia;
	
	private Integer numCitizens;
	
	@OneToOne
	private Country country;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "province")
	private List<City> cities = new ArrayList<>();
}
