package com.zubaray.ecommerce.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.zubaray.ecommerce.dao.ProductDao;
import com.zubaray.ecommerce.dao.TagDao;
import com.zubaray.ecommerce.model.Product;
import com.zubaray.ecommerce.model.Tag;
import com.zubaray.ecommerce.service.TagService;

@Transactional
@Component
public class TagServiceImpl implements TagService {
	
	@Autowired
	 private TagDao tagDao;
		
	 @Autowired
	 private ProductDao productDao;

	@Override
	public void addTagToProduct(long idProduct, long idTag) {
		Product product = productDao.findById(idProduct).orElse(null);
		   Tag tag = tagDao.findById(idTag).orElse(null);
		   tag.addProductToTag(product);
		   product.addTag(tag);
		
	}

	@Override
	public List<Tag> findTagsForProduct(long idProduct) {
		 Product product = productDao.findById(idProduct).orElse(null);
		   return product.getTags();
	}

	@Override
	public List<Tag> findAllTags() {
		return tagDao.findAll();
	}

	@Override
	public void deleteTagFromProduct(long idTag, long idProduct) {
		Product product = productDao.findById(idProduct).orElse(null);
		   Tag tag = tagDao.findById(idTag).orElse(null);
		   product.getTags().remove(tag);
		
	}

	@Override
	public Tag addTag(Tag tag) {
		return tagDao.save(tag);
	}

	@Override
	public void deleteTag(long id) {
		 tagDao.deleteById(id);
		
	}

	@Override
	public Tag findTagById(long id) {
		return tagDao.findById(id).orElse(null);
	}

	@Override
	public List<Product> findProductsForTag(long idTag) {
		 Tag tag = tagDao.findById(idTag).orElse(null);
		   return tag.getProducts();
	}

}
