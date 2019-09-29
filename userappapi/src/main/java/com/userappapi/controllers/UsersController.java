package com.userappapi.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.userappapi.models.User;
import com.userappapi.services.userservice.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * UsersController
 */
@RestController
@RequestMapping("/user")
public class UsersController {
    
    @Autowired
    private UserService userService;    


    @RequestMapping("/listallusers")
    public List<User> getAllUsers(){

        return this.userService.getAllUsers();
      }

}