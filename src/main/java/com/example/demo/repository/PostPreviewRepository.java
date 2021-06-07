package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.PostPreview;

@Repository("postPreviewRepository")
public interface PostPreviewRepository extends JpaRepository<PostPreview,Integer>{
	
}
