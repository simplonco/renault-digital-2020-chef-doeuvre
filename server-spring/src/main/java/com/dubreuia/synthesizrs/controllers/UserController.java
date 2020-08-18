package com.dubreuia.synthesizrs.controllers;

import com.dubreuia.synthesizrs.dtos.UserDto;
import com.dubreuia.synthesizrs.model.User;
import com.dubreuia.synthesizrs.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public void register(@RequestBody UserDto user) {
        userService.registerUser(new User(user.getUsername(), user.getPassword()));
    }

}