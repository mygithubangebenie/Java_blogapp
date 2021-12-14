package com.danny.blogapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.danny.blogapp.entities.Blog;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Long>{

}
