package com.example.demo.entities;

import java.net.URL;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PostPreview")
public class PostPreview {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	public String slug;

	public URL url;

	public String previewImagePath;
}
