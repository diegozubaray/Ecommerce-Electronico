package com.zubaray.ecommerce.impl;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.zubaray.ecommerce.dao.OrderProductDao;
import com.zubaray.ecommerce.model.OrderProduct;
import com.zubaray.ecommerce.service.OrderProductService;

@Transactional
@Component
public class OrderProductServiceImpl implements OrderProductService{
	
	 @Autowired
	 private OrderProductDao orderProductDao;

	@Override
	public OrderProduct create(@NotNull(message = "The products for order cannot be null.") @Valid OrderProduct orderProduct) {
		   return this.orderProductDao.save(orderProduct);
		 }

}
