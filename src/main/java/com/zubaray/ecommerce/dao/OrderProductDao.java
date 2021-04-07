package com.zubaray.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zubaray.ecommerce.model.OrderProduct;

public interface OrderProductDao extends JpaRepository<OrderProduct, Long>{

}
