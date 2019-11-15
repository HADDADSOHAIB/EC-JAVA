package com.be.ec.resource;

import java.util.List;

import com.be.ec.Dto.CartItemDto;

public class CartResource {

	private int cartId;

	private String ownerToken;
	
	private List<CartItemResource> items;

	public CartResource() {
		super();
	}
	public CartResource(int cartId, String ownerToken, List<CartItemResource> items) {
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

	public List<CartItemResource> getItems() {
		return items;
	}

	public void setItems(List<CartItemResource> items) {
		this.items = items;
	}
	
}
