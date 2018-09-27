package com.dbg.demo.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbg.demo.model.Car;

public interface CarDAO extends JpaRepository<Car, Integer> {

//	select * from car where model like '%?1%'

	Optional<Car> findOneByMatricula(String m);

}
