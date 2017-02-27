package com.geek.service;

import com.geek.model.User;

/**
 * Created by Liuqi
 * Date: 2016/10/22.
 */
public interface UserService {
    public boolean addUser(User user);

    public User findUser(Integer id);

    public boolean login(User user);
}
