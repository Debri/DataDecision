package com.geek.model;

/**
 * Created by Liuqi
 * Date: 2016/10/22.
 */
public class User {
    private Integer id;
    private String name;
    private String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public User() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "id:  "+id.toString()+"name:  "+name + "password:  "+ password;
    }
}
