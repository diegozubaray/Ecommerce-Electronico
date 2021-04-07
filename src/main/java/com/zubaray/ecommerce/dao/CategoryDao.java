package com.zubaray.ecommerce.dao;



import org.springframework.data.jpa.repository.JpaRepository;


import com.zubaray.ecommerce.model.Category;



public interface CategoryDao extends JpaRepository<Category, Long> {	
	

}
