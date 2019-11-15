package com.be.ec.mapper;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {
	
	@Bean
	public CartItemMapper cartItemMapper() {
		return new CartItemMapper();
	}
	
	@Bean
	public CartMapper cartMapper() {
		return new CartMapper();
	}
}
