package com.dbg.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbg.demo.model.User;

public interface UserDAO extends JpaRepository<User, Integer> {

}
