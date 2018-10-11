package com.mindtree.Login.service;

import java.util.List;

import com.mindtree.Login.model.User;

public interface UserService {

	//User findById(int id);

	User create(User user);

	List findAll();

}
