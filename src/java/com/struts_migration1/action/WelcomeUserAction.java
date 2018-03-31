package com.struts_migration1.action;

import com.opensymphony.xwork2.ActionSupport;

public class WelcomeUserAction extends ActionSupport {

    private String userName;
    private String password;

    @Override
    public String execute() throws Exception {

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
}
