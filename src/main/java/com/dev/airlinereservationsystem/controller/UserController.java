package com.dev.airlinereservationsystem.controller;

import com.dev.airlinereservationsystem.dto.UserDto;
import com.dev.airlinereservationsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
@CrossOrigin("*")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody UserDto userDto){
        String result = userService.registerUser(userDto);
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }
}
