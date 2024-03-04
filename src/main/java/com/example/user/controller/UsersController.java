

package com.example.user.controller;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.example.user.model.Users;
import com.example.user.repo.UsersRepo;


@RestController
@RequestMapping("/user")
public class UsersController {
	@Autowired
	private UsersRepo usersRepo;
	
	@PostMapping("/set")
	public ResponseEntity<?> setuser(@RequestBody Users users) {
		
		
		Users use = usersRepo.save(users);
		
		return ResponseEntity.status(HttpStatus.OK)
				.body(use);
	}
	
	
	@PostMapping("/check")
	public ResponseEntity<?> validateUser(@RequestBody Users user) {
		
		
		Users use = usersRepo.findUser(user.getEmail(), user.getPassword());
		
		if(use!=null) {
					return ResponseEntity.status(HttpStatus.OK)
						.body(use);
				}else {
					return ResponseEntity.status(HttpStatus.BAD_REQUEST)
							.body("Data not found");
				}
				
}
}
