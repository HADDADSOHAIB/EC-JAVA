package com.be.ec.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.be.ec.entity.CartItemEntity;

@Repository
public interface CartItemRepository extends CrudRepository<CartItemEntity, Integer> {

}
