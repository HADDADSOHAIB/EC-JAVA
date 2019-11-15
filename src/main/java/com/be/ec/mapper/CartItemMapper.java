package com.be.ec.mapper;

import org.springframework.beans.factory.annotation.Autowired;

import com.be.ec.Dto.CartItemDto;
import com.be.ec.entity.CartItemEntity;
import com.be.ec.resource.CartItemResource;
import com.be.ec.resource.CartResource;

public class CartItemMapper {
	
	@Autowired
	private CartMapper cartMapper;


	public CartItemResource dtoToResource(CartItemDto cartItemDto) {
		
		CartItemResource cartItemResource=new CartItemResource();
		cartItemResource.setItemId(cartItemDto.getItemId());
		cartItemResource.setItemName(cartItemDto.getItemName());
		cartItemResource.setItemPrice(cartItemDto.getItemPrice());
		cartItemResource.setItemQuantity(cartItemDto.getItemQuantity());
		
		return cartItemResource;
	}
	
	public CartItemEntity resourceToEntity(CartItemResource cartItemResource, CartResource cartResource) {
		
		CartItemEntity cartItemEntity=new CartItemEntity();
		cartItemEntity.setCart(cartMapper.ResourceToEntity(cartResource));
		cartItemEntity.setItemId(cartItemResource.getItemId());
		cartItemEntity.setItemName(cartItemResource.getItemName());
		cartItemEntity.setItemPrice(cartItemResource.getItemPrice());
		cartItemEntity.setItemQuantity(cartItemResource.getItemQuantity());
		return cartItemEntity;
	}
	
	public CartItemResource entityToResource(CartItemEntity cartItemEntity) {
		CartItemResource cartItemResource=new CartItemResource();
		cartItemResource.setItemId(cartItemEntity.getItemId());
		cartItemResource.setItemName(cartItemEntity.getItemName());
		cartItemResource.setItemPrice(cartItemEntity.getItemPrice());
		cartItemResource.setItemQuantity(cartItemEntity.getItemQuantity());
		return cartItemResource;
	}
	
	public CartItemDto resourceToDto(CartItemResource cartItemResource) {
		CartItemDto cartItemDto=new CartItemDto();
		cartItemDto.setItemId(cartItemResource.getItemId());
		cartItemDto.setItemName(cartItemResource.getItemName());
		cartItemDto.setItemPrice(cartItemResource.getItemPrice());
		cartItemDto.setItemQuantity(cartItemResource.getItemQuantity());
		return cartItemDto;
	}
}
