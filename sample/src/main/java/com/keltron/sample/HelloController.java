package com.keltron.sample;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
	private final GreetingService greetingService;
	
	public HelloController(GreetingService greetingService) {
		this.greetingService=greetingService;
	}
	
	
@GetMapping("/hello")
public String sayHello() {
    return greetingService.getgreeting();
}

@PostMapping("/addUser")
	public User addUser(@RequestParam("name")String name)
	{
		return greetingService.addUser(name);
	}

@GetMapping("/users")
public List<User> getAllUsers() {
	return greetingService.getAllUsers();
}

@GetMapping("/ping")
public String sayping() {
    return "Hello from Spring Boot + Gradle!";
}
}
