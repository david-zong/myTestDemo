package com.zongdw.hessian.client;

import java.io.Serializable;

public class User implements Serializable {
    String userName ="snoopy";
    String password ="showme";
    public User(String user, String pwd) {
    this.userName =user;
    this.password= pwd;
    }
    public String getUserName() {
    return userName;
    }
    public String getPassword() {
    return password;
    }
}
