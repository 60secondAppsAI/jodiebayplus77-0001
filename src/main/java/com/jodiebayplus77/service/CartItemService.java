package com.jodiebayplus77.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.jodiebayplus77.domain.CartItem;
import com.jodiebayplus77.dto.CartItemDTO;
import com.jodiebayplus77.dto.CartItemSearchDTO;
import com.jodiebayplus77.dto.CartItemPageDTO;
import com.jodiebayplus77.dto.CartItemConvertCriteriaDTO;
import com.jodiebayplus77.service.GenericService;
import com.jodiebayplus77.dto.common.RequestDTO;
import com.jodiebayplus77.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface CartItemService extends GenericService<CartItem, Integer> {

	List<CartItem> findAll();

	ResultDTO addCartItem(CartItemDTO cartItemDTO, RequestDTO requestDTO);

	ResultDTO updateCartItem(CartItemDTO cartItemDTO, RequestDTO requestDTO);

    Page<CartItem> getAllCartItems(Pageable pageable);

    Page<CartItem> getAllCartItems(Specification<CartItem> spec, Pageable pageable);

	ResponseEntity<CartItemPageDTO> getCartItems(CartItemSearchDTO cartItemSearchDTO);
	
	List<CartItemDTO> convertCartItemsToCartItemDTOs(List<CartItem> cartItems, CartItemConvertCriteriaDTO convertCriteria);

	CartItemDTO getCartItemDTOById(Integer cartItemId);







}





