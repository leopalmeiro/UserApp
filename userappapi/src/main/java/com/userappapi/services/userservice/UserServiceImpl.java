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
        users.add(new User(1,"Leonardo 01","https://randomuser.me/api/portraits/lego/1.jpg"));
        users.add(new User(2,"Leonardo 02","https://randomuser.me/api/portraits/lego/2.jpg"));
        users.add(new User(3,"Leonardo 03","https://randomuser.me/api/portraits/lego/3.jpg"));
        users.add(new User(4,"Leonardo 04","https://randomuser.me/api/portraits/lego/4.jpg"));

        return users;
    }

    
}