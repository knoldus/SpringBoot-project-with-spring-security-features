package com.service;

import com.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * The type User service.
 */
@Service
public class UserService {
    /**
     * The User list.
     */
    List<User> userList=new ArrayList<>();

    /**
     * Instantiates a new User service.
     */
    public UserService(){
        userList.add(new User("uzair","12345","uzair@gmail.com"));
        userList.add(new User("akash","abcde","akash@gmail.com"));
    }

    /**
     * Get all users list.
     *
     * @return the list
     */
//get all users
    public List<User> getAllUsers(){
        return  this.userList;
    }

    /**
     * Get user user.
     *
     * @param username the username
     * @return the user
     */
//get single user
    public User getUser(String username){
        return  this.userList.stream().filter((user )-> user.getUsername().equals(username)).findAny().orElse(null);
    }

}
