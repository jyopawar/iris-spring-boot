package com.jyoti.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jyoti.dao.Userepository;
import com.jyoti.model.User;

@Service
public class UserService {

	@Autowired
	Userepository userRepository;
		
	public User getUser(Long id) {
  
  		return userRepository.findById(id).orElseThrow();
		
	}
	
   //  public User deleteUser(int id) {
 
	public User addUser(User user) {
		  
  		return userRepository.save(user);
		
	}

	public String deleteUser(Long id) {
		// TODO Auto-generated method stub
		 userRepository.deleteById(id);
		 return "record has been deleted";
		 
	}


	
}



