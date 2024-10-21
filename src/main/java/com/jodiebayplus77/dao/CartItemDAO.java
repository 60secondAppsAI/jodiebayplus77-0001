package com.jodiebayplus77.dao;

import java.util.List;

import com.jodiebayplus77.dao.GenericDAO;
import com.jodiebayplus77.domain.CartItem;





public interface CartItemDAO extends GenericDAO<CartItem, Integer> {
  
	List<CartItem> findAll();
	






}


