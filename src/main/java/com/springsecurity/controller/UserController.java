package com.springsecurity.controller;

import com.springsecurity.model.User;
import com.springsecurity.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
@Autowired
private UserService userService = new UserService();

    @GetMapping("/allUsers")
    public List<User> getAllUser(){
       return this.userService.getList();
    }

    @GetMapping("/{username}")
    public User getUserById(@PathVariable("username") String username){
        return this.userService.getUserById(username);
    }

    @PostMapping("/addUser")
    public String addUser(@RequestBody User user){
        return this.userService.addUser(user);
    }
}
