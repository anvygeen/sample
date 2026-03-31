package com.keltron.sample;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
	private final UserRepository userRepository;
	
	public GreetingService(UserRepository userRepository)
	{
		this.userRepository=userRepository;
	}
  public String getgreeting() {
	return "hello from service layer!!!!";
	  
  }
	public User addUser(String name) 
	{
		User user=new User();
		user.setName(name);
		return userRepository.save(user);
	}
		public List<User> getAllUsers(){
			return userRepository.findAll();
		}
	
  }

