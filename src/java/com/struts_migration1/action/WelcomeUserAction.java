package com.struts_migration1.action;

import com.opensymphony.xwork2.ActionSupport;
import com.struts_migration1.services.model.User;
import com.struts_migration1.services.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WelcomeUserAction extends ActionSupport {

    private String userName;
    private String password;

    private List<User> users;

    @Autowired
    private UserService userService;

    @Override
    public String execute() throws Exception {
        this.users = userService.getUsers();
        return SUCCESS;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<User> getUsers() {
        return users;
    }
}
