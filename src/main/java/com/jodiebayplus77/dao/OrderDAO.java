package com.jodiebayplus77.dao;

import java.util.List;

import com.jodiebayplus77.dao.GenericDAO;
import com.jodiebayplus77.domain.Order;





public interface OrderDAO extends GenericDAO<Order, Integer> {
  
	List<Order> findAll();
	






}


