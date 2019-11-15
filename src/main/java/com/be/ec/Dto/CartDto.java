package com.be.ec.Dto;

import java.util.List;

public class CartDto {

	private int cartId;

	private String ownerToken;
	
	private List<CartItemDto> items;
	
	public CartDto() {
		super();
	}

	public CartDto(int cartId, String ownerToken, List<CartItemDto> items) {
		super();
		this.cartId = cartId;
		this.ownerToken = ownerToken;
		this.items = items;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public String getOwnerToken() {
		return ownerToken;
	}

	public void setOwnerToken(String ownerToken) {
		this.ownerToken = ownerToken;
	}

	public List<CartItemDto> getItems() {
		return items;
	}

	public void setItems(List<CartItemDto> items) {
		this.items = items;
	}
	
}
