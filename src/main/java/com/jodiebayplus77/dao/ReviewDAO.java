package com.jodiebayplus77.dao;

import java.util.List;

import com.jodiebayplus77.dao.GenericDAO;
import com.jodiebayplus77.domain.Review;





public interface ReviewDAO extends GenericDAO<Review, Integer> {
  
	List<Review> findAll();
	






}


