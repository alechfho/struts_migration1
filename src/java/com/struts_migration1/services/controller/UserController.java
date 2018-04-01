package com.struts_migration1.services.controller;

import com.struts_migration1.services.model.UserList;
import com.struts_migration1.services.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/users")
    public @ResponseBody UserList getUsers() {
        return userService.getUsers();
    }
}