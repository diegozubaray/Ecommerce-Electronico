package com.zubaray.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zubaray.ecommerce.model.Comment;

public interface CommentDao extends JpaRepository<Comment, Long>  {

}
