package com.geek.service.impl;

import com.geek.manager.UserMapper;
import com.geek.model.User;
import com.geek.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Liuqi
 * Date: 2016/10/22.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userDao;

    public boolean addUser(User user) {
        boolean boo = false;
        if (user != null) {
            Integer i = userDao.addUser(user);
            if (i == 1) {
                boo = true;
            }
        }
        return boo;

    }

    public User findUser(Integer id) {
       return userDao.findUserById(id);
    }

    public boolean login(User user) {
        return false;
    }
}
