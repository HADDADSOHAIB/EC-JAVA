package com.be.ec.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.be.ec.Dto.CartDto;
import com.be.ec.mapper.CartMapper;
import com.be.ec.resource.CartResource;
import com.be.ec.service.CartService;
import com.nimbusds.oauth2.sdk.http.HTTPRequest.Method;

@RestController
@RequestMapping("/carts")
public class CartController {
	
	private CartService cartService;
	private CartMapper cartMapper;
	
	@Autowired
	public CartController(CartService cartService, CartMapper cartMapper) {
		super();
		this.cartService = cartService;
		this.cartMapper = cartMapper;
	}


	@PostMapping(produces="application/json")
	public CartDto saveCart(@RequestBody CartDto cartDto) {
		CartResource cartResource=cartMapper.dtoToResource(cartDto);
		cartResource=cartService.saveCart(cartResource);
		return cartMapper.resourceToDto(cartResource);
	}
}
