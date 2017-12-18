package com.bridgeit.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bridgeit.model.UserBean;
import com.bridgeit.service.UserService;

@RestController
public class UserController {

	
	@Autowired
    private UserService userService;

	@RequestMapping(value="/user/{id}",method=RequestMethod.GET,produces = "application/json")
	public ResponseEntity user(@PathVariable ("id") int id)
	{
		System.out.println(id);
		System.out.println(userService);
		UserBean user = userService.getUser(id);
		System.out.println(user);
		if(user==null) {
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity(HttpStatus.OK);
	}
}
