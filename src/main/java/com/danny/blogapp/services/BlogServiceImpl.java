package com.danny.blogapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danny.blogapp.entities.Blog;
import com.danny.blogapp.repositories.BlogRepository;

@Service
public class BlogServiceImpl implements BlogService{
	
	@Autowired
	BlogRepository blogRepo;

	@Override
	public Blog createBlog(Blog blog) {
		
		return blogRepo.save(blog);
	}

	@Override
	public Optional<Blog> getBlog(long id) {
		return blogRepo.findById(id);
		
	}

	@Override
	public List<Blog> getBlogs() {
		// TODO Auto-generated method stub
		return blogRepo.findAll();
	}

	@Override
	public void deleteBlog(long id) {
		// TODO Auto-generated method stub
		blogRepo.deleteById(id);
	}

	@Override
	public Blog updateBlog(Blog blog) {
		// TODO Auto-generated method stub
		 Blog b=blogRepo.getById(blog.getId());
		 b.setTitle(blog.getTitle()); 
		 b.setDescription(blog.getDescription());
		return blogRepo.save(b);
	}

}
