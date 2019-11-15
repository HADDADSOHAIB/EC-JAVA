package com.be.ec.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.be.ec.entity.CartEntity;

@Repository
public interface CartRepository extends CrudRepository<CartEntity, Integer>{

}
