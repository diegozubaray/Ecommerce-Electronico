package com.zubaray.ecommerce.service;

import java.util.List;

import com.zubaray.ecommerce.model.Product;
import com.zubaray.ecommerce.model.Tag;

public interface TagService {
	
	 void addTagToProduct(long idProduct, long idTag);
		
	 List<Tag> findTagsForProduct(long idProduct);
		
	 List<Tag> findAllTags();
		
	 void deleteTagFromProduct(long idTag, long idProduct);
		
	 Tag addTag(Tag tag);
		
	 void deleteTag(long id);
		
	 Tag findTagById(long id);
		 
	 List<Product> findProductsForTag(long idTag);

	}