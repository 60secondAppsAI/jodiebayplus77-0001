package com.jodiebayplus77.dao;

import java.util.List;

import com.jodiebayplus77.dao.GenericDAO;
import com.jodiebayplus77.domain.Item;





public interface ItemDAO extends GenericDAO<Item, Integer> {
  
	List<Item> findAll();
	






}


