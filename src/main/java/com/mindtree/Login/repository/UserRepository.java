package com.mindtree.Login.repository;



import java.util.List;

import org.springframework.data.repository.Repository;

import com.mindtree.Login.model.User;

public interface UserRepository extends Repository<User,Long>{
	
	//User findOne(int id);

	User save(User user);

	List findAll();

	//User findById(int id);


}
