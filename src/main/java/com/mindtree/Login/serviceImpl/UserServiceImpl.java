package com.mindtree.Login.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mindtree.Login.model.User;
import com.mindtree.Login.repository.UserRepository;
import com.mindtree.Login.service.UserService;



@Service
public class UserServiceImpl implements UserService {
	
	 @Autowired
	    private UserRepository repository;

	    @Transactional
	    public User create(User user) {
	        return repository.save(user);
	    }
	    
	   /* @Transactional
	    public User findById(int id) {
	        return repository.findById(id);
	    }*/
	    
	    @Transactional
	    public List findAll() {
	        return repository.findAll();
	    }



}
