package com.example.demo.controller;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.PostEntity;
import com.example.demo.service.PostService;

@RestController
@RequestMapping(path = "/example")
public class PostController {
	final static Logger logger = LoggerFactory.getLogger(PostController.class);
	@Autowired
	PostService postService;

	@GetMapping(path = "/get/{id}")
	public @ResponseBody PostEntity getPostEntity(@RequestParam int id) {
		try {
			return postService.getPostEntity(id);
		} catch (Exception e) {
			logger.warn("PostController failed to retrieve post: %s", e.getMessage());
			return null;
		}
	}

	@PostMapping(path = "/create")
	public @ResponseBody PostEntity createPostEntity(PostEntity postEntity) {
		try {
			return postService.savePostEntity(postEntity);
		} catch (Exception e) {
			logger.warn("PostController failed to create new post: %s", e.getMessage());
			return null;
		}
	}

	@PatchMapping(path = "/update/{id}")
	public @ResponseBody PostEntity updatePostEntity(@RequestParam int id, PostEntity newPostEntityState) {
		try {
			PostEntity postEntity = postService.getPostEntity(id);
			postEntity = newPostEntityState;
			return postService.savePostEntity(postEntity);
		} catch (Exception e) {
			logger.warn("PostController failed to update post: %s", e.getMessage());
			return null;
		}
	}

	@DeleteMapping(path = "/delete/{id}")
	public void deletePostEntity(@RequestParam int id) {
		try {
			postService.postDelete(id);
		} catch (Exception e) {
			logger.warn("PostController failed to delete post: %s", e.getMessage());
		}
	}
	@RequestMapping(path="/error")
	public void displayError() {
		
	}
}
