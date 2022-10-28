package com.cts.ecart.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.ecart.entity.Cart;

public interface CartDao extends JpaRepository<Cart, Integer>{

}
