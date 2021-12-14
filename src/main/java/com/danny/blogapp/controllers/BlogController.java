package com.danny.blogapp.controllers;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.danny.blogapp.entities.Blog;
import com.danny.blogapp.services.BlogServiceImpl;

@RestController
public class BlogController {

	@Autowired
	BlogServiceImpl blogService;
	
	
	@GetMapping("/")
	public String home() {
		return "Welcome to blog app";
	}
	
	@GetMapping("/blogs")
	public List<Blog> getAll(){
		return blogService.getBlogs();
	}
	
	@GetMapping("/blogs/{id}")
	public Optional<Blog> getOne(@PathVariable("id") long id){
		System.out.print("Id====> "+id);
		return blogService.getBlog(id);
	}
	
	@PostMapping("/blogs/create")
	public Blog createBlog(@RequestBody Blog blog){
		return blogService.createBlog(blog);
	}
	
	@DeleteMapping("/blogs/remove/{id}")
	public String deleteBlog(@PathParam("id") long id){
		blogService.deleteBlog(id);
		return "Blog was deleted";
	}
	@PutMapping("/blogs/update/{id}")
	public Blog update(@RequestBody Blog blog){
		return blogService.updateBlog(blog);	
	}
	
}
