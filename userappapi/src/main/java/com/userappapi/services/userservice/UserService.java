package com.userappapi.services.userservice;

import java.util.List;

import com.userappapi.models.User;

import org.springframework.stereotype.Service;

/**
 * UserService
 */
@Service
public interface UserService {

    public List<User> getAllUsers();

}