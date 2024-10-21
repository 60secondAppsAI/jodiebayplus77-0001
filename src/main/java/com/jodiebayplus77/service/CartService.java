package com.jodiebayplus77.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.jodiebayplus77.domain.Cart;
import com.jodiebayplus77.dto.CartDTO;
import com.jodiebayplus77.dto.CartSearchDTO;
import com.jodiebayplus77.dto.CartPageDTO;
import com.jodiebayplus77.dto.CartConvertCriteriaDTO;
import com.jodiebayplus77.service.GenericService;
import com.jodiebayplus77.dto.common.RequestDTO;
import com.jodiebayplus77.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface CartService extends GenericService<Cart, Integer> {

	List<Cart> findAll();

	ResultDTO addCart(CartDTO cartDTO, RequestDTO requestDTO);

	ResultDTO updateCart(CartDTO cartDTO, RequestDTO requestDTO);

    Page<Cart> getAllCarts(Pageable pageable);

    Page<Cart> getAllCarts(Specification<Cart> spec, Pageable pageable);

	ResponseEntity<CartPageDTO> getCarts(CartSearchDTO cartSearchDTO);
	
	List<CartDTO> convertCartsToCartDTOs(List<Cart> carts, CartConvertCriteriaDTO convertCriteria);

	CartDTO getCartDTOById(Integer cartId);







}





