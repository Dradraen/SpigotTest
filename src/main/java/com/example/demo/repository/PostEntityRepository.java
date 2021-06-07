package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.PostEntity;

@Repository("PostEntityRepository")
public interface PostEntityRepository extends JpaRepository<PostEntity,Integer>{

}
