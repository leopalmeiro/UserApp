package com.userappapi.services.userservice;

import java.util.ArrayList;
import java.util.List;

import com.userappapi.models.User;

import org.springframework.stereotype.Component;

/**
 * UserServiceImpl
 */
@Component("UserService")
public class UserServiceImpl implements UserService {

    /*     
    * @author  Leonardo Palmeiro
    * @params
    * @return List of all Users
    */
    @Override
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User(1,"Leonardo 01","test 01"));
        users.add(new User(2,"Leonardo 02","test 02"));
        users.add(new User(3,"Leonardo 03","test 03"));
        users.add(new User(4,"Leonardo 04","test 04"));

        return users;
    }

    
}