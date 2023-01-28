package com.jk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jk.model.book.Book;
import com.jk.model.user.User;
import com.jk.repo.book.BookRepository;
import com.jk.repo.user.UserRepository;

@RestController
public class CommonController {
    
	@Autowired
     private UserRepository userRepo;
	//private UserMapper usermapper;
	
	@Autowired
	private BookRepository bookRepo;
	//private BookMapper bookmapper;
	
	@GetMapping("/getUsers")
	public List<User> getUser(){
		//List<User> userList= usermapper.findAll();
		List<User> userList= userRepo.findAll();
		return userList;
	}
	@GetMapping("/getBooks")
	public List<Book> getBooks(){
		//List<Book> bookList= bookmapper.findAll();
		List<Book> bookList= bookRepo.findAll();
		return bookList;
	}
}
