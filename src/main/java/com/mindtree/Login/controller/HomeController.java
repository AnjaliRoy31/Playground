package com.mindtree.Login.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.Login.model.User;
import com.mindtree.Login.service.UserService;

@RestController
@RequestMapping("/api")
public class HomeController {
	

	    @Autowired
	    private UserService userService;

	    @PostMapping(path = "/create")
	    public User create(@RequestBody User user){
	        return userService.create(user);
	    }

	    @GetMapping
	    public List findAll(){
	        return userService.findAll();
	    }

	}



