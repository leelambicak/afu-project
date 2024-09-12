package com.imaginnovate.user_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imaginnovate.user_service.model.User;
import com.imaginnovate.user_service.repository.UserRepository;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
   private UserRepository userRepository;

    @GetMapping("all")
   public List<User> getAll(){
       List<User> user = userRepository.findAll();
       return user;
   }
}
