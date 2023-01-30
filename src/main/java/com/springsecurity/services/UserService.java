package com.springsecurity.services;

import com.springsecurity.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    List<User> list =new ArrayList<User>();

    public UserService() {
        list= List.of(new User("ujjawal2503","12345","ujjawal25@gmail.com"),
                new User("Aseem07","12345","Aseem25@gmail.com"),
                new User("Arpita07","12345","Arpita25@gmail.com")
        );
    }

    //get all user
    public List<User> getList() {
        return list;
    }

    //get user by id
    public User getUserById(String id){
        return list.stream().filter(user -> user.getUsername().equals(id)).findAny().orElse(null);
    }

    //adding user to the list
    public String addUser(User user){
        list.add(user);
        return "Successfully added";
    }
}
