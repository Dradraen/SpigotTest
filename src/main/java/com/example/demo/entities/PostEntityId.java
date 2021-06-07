package com.example.demo.entities;

import java.io.Serializable;

public class PostEntityId implements Serializable{
	private Integer id;
	private String packageName;
	private int position;
	
	public PostEntityId(Integer id, String packageName, int position) {
		this.id = id;
		this.packageName = packageName;
		this.position = position;
	}	
}
