package com.jodiebayplus77.dao;

import java.util.List;

import com.jodiebayplus77.dao.GenericDAO;
import com.jodiebayplus77.domain.User;

import java.util.Optional;




public interface UserDAO extends GenericDAO<User, Integer> {
  
	List<User> findAll();
	






}


