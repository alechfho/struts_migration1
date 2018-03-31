package com.struts_migration1.services.controller;

import com.struts_migration1.services.model.User;
import com.struts_migration1.services.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("controllers/users")
    public List<User> getUsers() {
        return userService.getUsers();
    }
}