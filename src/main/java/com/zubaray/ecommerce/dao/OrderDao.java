package com.zubaray.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zubaray.ecommerce.model.Order;

public interface OrderDao extends JpaRepository<Order, Long> {

}
