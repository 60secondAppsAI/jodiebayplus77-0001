package com.jodiebayplus77.service;

import com.jodiebayplus77.dao.GenericDAO;

public interface GenericService<T, ID> {

    abstract GenericDAO<T, ID> getDAO();

    T getById(Integer id) ;

}