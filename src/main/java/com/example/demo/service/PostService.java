package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.PostEntity;
import com.example.demo.repository.PostEntityRepository;

@Service("PostService")
public class PostService {
	@Autowired
	PostEntityRepository postEntityRepository;
	
	public PostEntity getPostEntity(int id) {
		return postEntityRepository.findById(id).get();
	}
	
	public PostEntity savePostEntity(PostEntity postEntity) {
		return postEntityRepository.save(postEntity);
	}
	
	public void postDelete(int id) {
		
	}
}
