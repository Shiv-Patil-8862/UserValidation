package com.Techno.UserValidation.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Techno.UserValidation.DTO.UserRequest;
import com.Techno.UserValidation.Entity.User;
import com.Techno.UserValidation.Exception.UserNotFoundException;
import com.Techno.UserValidation.Service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping("/signup")
	public ResponseEntity<User> saveUser(@RequestBody @Valid UserRequest userRequest){
		return new ResponseEntity<>(userService.saveUser(userRequest), HttpStatus.CREATED);
	}
	
	@GetMapping("/fetchAll")
	public ResponseEntity<List<User>> getAllUsers(){
		return ResponseEntity.ok(userService.getAllUsers());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<User> getUser(@PathVariable int id)throws UserNotFoundException{
		return ResponseEntity.ok(userService.getUser(id));
	}
}
