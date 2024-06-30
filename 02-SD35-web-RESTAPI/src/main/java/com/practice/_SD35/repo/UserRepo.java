package com.practice._SD35.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice._SD35.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long>{
	
	User findByUserName(String UserName);
	User findByPassword(String password);
	User findByUserNameAndPassword(String UserName, String password);

}
