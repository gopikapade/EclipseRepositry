package com.cjc.main.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.app.servicei.UserService;

@RestController
public class UserController {

	@Autowired
	UserService useservice;
	
	
}
