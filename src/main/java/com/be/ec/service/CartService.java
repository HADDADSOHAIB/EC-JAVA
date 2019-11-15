package com.be.ec.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.be.ec.entity.CartEntity;
import com.be.ec.entity.CartItemEntity;
import com.be.ec.mapper.CartItemMapper;
import com.be.ec.mapper.CartMapper;
import com.be.ec.repository.CartItemRepository;
import com.be.ec.repository.CartRepository;
import com.be.ec.resource.CartResource;

@Service
public class CartService {
	
	private CartRepository cartRepository;
	private CartItemRepository cartItemRepository;
	private CartItemMapper cartItemMapper;
	private CartMapper cartMapper;
	
	@Autowired
	public CartService(CartRepository cartRepository, CartItemRepository cartItemRepository,
			CartItemMapper cartItemMapper, CartMapper cartMapper) {
		super();
		this.cartRepository = cartRepository;
		this.cartItemRepository = cartItemRepository;
		this.cartItemMapper = cartItemMapper;
		this.cartMapper = cartMapper;
	}

	public CartResource saveCart(CartResource cartResource) {
		
		List<CartItemEntity> entityList=new ArrayList();
		cartResource.getItems().forEach(item->{
			entityList.add(cartItemRepository.save(cartItemMapper.resourceToEntity(item, cartResource)));
		});
		CartEntity cartEntity=cartRepository.save(cartMapper.ResourceToEntity(cartResource));
		return cartMapper.entityToResource(cartEntity, entityList);
	}
}
