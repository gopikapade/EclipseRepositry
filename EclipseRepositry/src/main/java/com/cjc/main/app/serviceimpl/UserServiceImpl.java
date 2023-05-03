package com.cjc.main.app.serviceimpl;

import javax.websocket.server.ServerEndpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.app.repositry.UserRepositry;
import com.cjc.main.app.servicei.UserService;
@Service
public class UserServiceImpl implements UserService {
	
	
	@Autowired
	UserRepositry userrepo;

}
