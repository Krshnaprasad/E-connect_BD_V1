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
import com.example.user.model.Bank;
import com.example.user.repo.BankRepo;

@RestController
@RequestMapping("/bank")
public class BankController {
	
	@Autowired
	public BankRepo bankRepo;
	
	@PostMapping("/set")
	public ResponseEntity<?> setuser(@RequestBody Bank bank) {
	
		Bank bankdetail = bankRepo.save(bank);
		
		return ResponseEntity.status(HttpStatus.OK)
				.body(bankdetail);
	}
	
	@GetMapping("/get")
	public ResponseEntity<?> getUser() {
		
		
		List<Bank> bank = bankRepo.findAll();
		
		return ResponseEntity.status(HttpStatus.OK)
				.body(bank);
	}

}
