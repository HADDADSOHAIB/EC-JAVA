package com.be.ec.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="CART")
public class CartEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	private int cartId;
	
	@Column(name="OWNER_TOKEN")
	private String ownerToken;
	
	public CartEntity() {
		super();
	}
	public CartEntity(int cartId, String ownerToken) {
		super();
		this.cartId = cartId;
		this.ownerToken = ownerToken;
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
}
