package com.be.ec.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.be.ec.Dto.CartDto;
import com.be.ec.Dto.CartItemDto;
import com.be.ec.entity.CartEntity;
import com.be.ec.entity.CartItemEntity;
import com.be.ec.resource.CartItemResource;
import com.be.ec.resource.CartResource;

public class CartMapper {

	@Autowired
	private CartItemMapper cartItemMapper;
	
	public CartResource dtoToResource(CartDto cartDto) {
		
		CartResource cartResource=new CartResource();
		cartResource.setCartId(cartDto.getCartId());
		cartResource.setOwnerToken(cartDto.getOwnerToken());
		List<CartItemResource> resourceList=new ArrayList();
		cartDto.getItems().forEach(cartItemDto->{
			resourceList.add(cartItemMapper.dtoToResource(cartItemDto));
		});
		cartResource.setItems(resourceList);
		return cartResource;
	}
	
	public CartEntity ResourceToEntity(CartResource cartResource) {
		CartEntity cartEntity=new CartEntity();
		cartEntity.setCartId(cartResource.getCartId());
		cartEntity.setOwnerToken(cartResource.getOwnerToken());
		return cartEntity;
	}
	
	public CartResource entityToResource(CartEntity cartEntity, List<CartItemEntity> items) {
		CartResource cartResource=new CartResource();
		cartResource.setCartId(cartEntity.getCartId());
		cartResource.setOwnerToken(cartEntity.getOwnerToken());
		List<CartItemResource> resourceList=new ArrayList();
		items.forEach(item->{
			resourceList.add(cartItemMapper.entityToResource(item));
		});
		cartResource.setItems(resourceList);
		return cartResource;
	}
	
	public CartDto resourceToDto(CartResource cartResource) {
		CartDto cartDto =new CartDto();
		cartDto.setCartId(cartResource.getCartId());
		cartDto.setOwnerToken(cartResource.getOwnerToken());
		List<CartItemDto> dtoList=new ArrayList();
		cartResource.getItems().forEach(item->{
			dtoList.add(cartItemMapper.resourceToDto(item));
		});
		cartDto.setItems(dtoList);
		return cartDto;
	}
}
