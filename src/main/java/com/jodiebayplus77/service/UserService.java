package com.jodiebayplus77.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.jodiebayplus77.domain.User;
import com.jodiebayplus77.dto.UserDTO;
import com.jodiebayplus77.dto.UserSearchDTO;
import com.jodiebayplus77.dto.UserPageDTO;
import com.jodiebayplus77.dto.UserConvertCriteriaDTO;
import com.jodiebayplus77.service.GenericService;
import com.jodiebayplus77.dto.common.RequestDTO;
import com.jodiebayplus77.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface UserService extends GenericService<User, Integer> {

	List<User> findAll();

	ResultDTO addUser(UserDTO userDTO, RequestDTO requestDTO);

	ResultDTO updateUser(UserDTO userDTO, RequestDTO requestDTO);

    Page<User> getAllUsers(Pageable pageable);

    Page<User> getAllUsers(Specification<User> spec, Pageable pageable);

	ResponseEntity<UserPageDTO> getUsers(UserSearchDTO userSearchDTO);
	
	List<UserDTO> convertUsersToUserDTOs(List<User> users, UserConvertCriteriaDTO convertCriteria);

	UserDTO getUserDTOById(Integer userId);







}





