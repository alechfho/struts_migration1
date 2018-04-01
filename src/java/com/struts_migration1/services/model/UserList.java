package com.struts_migration1.services.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class UserList implements Serializable {

    private List<User> userList = new ArrayList<>();

    public UserList() {

    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
