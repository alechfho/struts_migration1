package com.struts_migration1.services.controller;

import com.struts_migration1.services.model.User;
import com.struts_migration1.services.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/users")
    public @ResponseBody List<User> getUsers() {
        return userService.getUsers();
    }
}