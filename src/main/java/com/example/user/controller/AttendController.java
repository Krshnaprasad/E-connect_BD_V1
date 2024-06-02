package com.example.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.model.Attendance;
import com.example.user.model.Users;
import com.example.user.repo.AttendRepo;


@RestController
@RequestMapping("/attend")
public class AttendController {

	@Autowired
	private AttendRepo attendRepo;
	
	

	@PostMapping("/set")
	public ResponseEntity<?> setuser(@RequestBody Attendance attendance) {
	
		Attendance attend = attendRepo.save(attendance);
		
		return ResponseEntity.status(HttpStatus.OK)
				.body(attend);
	}
	@GetMapping("/get")
	public ResponseEntity<?> getUser() {
		
		
		List<Attendance> attend = attendRepo.findAll();
		
		return ResponseEntity.status(HttpStatus.OK)
				.body(attend);
	}
}
