package com.example.user.controller;

import com.example.user.model.CheckInOut;
import com.example.user.model.Users;
import com.example.user.repo.CheckInOutRepo;
import com.example.user.repo.UsersRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/")
public class CheckInOutController {

    @Autowired
    private CheckInOutRepo checkInOutRepo;

    @Autowired
    private UsersRepo usersRepo;

    @PostMapping("/checkin/{userId}")
    public ResponseEntity<?> setCheckIn(@PathVariable int userId) {
        Users user = usersRepo.findById(userId).get();
        
        CheckInOut checkInOut = new CheckInOut();
        checkInOut.setCheckIn(LocalDateTime.now());
        
        user.getCheckInOut().add(checkInOut);
        usersRepo.save(user);
        
       return ResponseEntity.status(HttpStatus.OK)
				.body(user);
    }

    @PostMapping("/checkout/{userId}")
    public ResponseEntity<?> setCheckOut(@PathVariable int userId) {
    	 Users user = usersRepo.findById(userId).get();
    	 
    	  CheckInOut checkInOut = new CheckInOut();
          checkInOut.setCheckOut(LocalDateTime.now());
          
          // Add check-out record to user
          user.getCheckInOut().add(checkInOut);
          usersRepo.save(user);
          
         return ResponseEntity.status(HttpStatus.OK)
  				.body(user);
                

   
    }
}

