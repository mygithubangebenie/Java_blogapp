package com.danny.blogapp.services;

import java.util.List;
import java.util.Optional;

import com.danny.blogapp.entities.Blog;

public interface BlogService {

	Blog createBlog(Blog Blog);
	Optional<Blog> getBlog(long id);
	List<Blog> getBlogs();
	void deleteBlog(long id);
	Blog updateBlog(Blog blog);
}
