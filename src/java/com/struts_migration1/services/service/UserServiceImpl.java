package com.struts_migration1.services.service;

import com.struts_migration1.services.model.User;
import com.struts_migration1.services.model.UserList;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private List<User> users;

    private UserServiceImpl() {
        users = new ArrayList<>();
        users.add(new User("user1", "Alec"));
        users.add(new User("user2", "Tomasz"));
    }

    @Override
    public UserList getUsers() {
        UserList userList = new UserList();
        userList.setUserList(users);
        return userList;
    }
}
