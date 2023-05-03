package com.cjc.main.app.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjc.main.app.model.User;

public interface UserRepositry extends JpaRepository<User, Integer> {

}
