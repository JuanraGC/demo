package com.dbg.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Country {
	
	// Atributos
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idCountry;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "country")
	private List<Province> province = new ArrayList<>();
	
	private Integer numProvincias;
}
