package com.geek.service.impl;

import com.geek.model.User;
import com.geek.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by Liuqi
 * Date: 2016/10/22.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring-mybatis.xml"})
public class UserServiceImplTest {
    @Resource
    private UserService userService;

    @Test
    public void addUser() throws Exception {
        assertTrue(userService.addUser(new User("hh卡卡", "21321")));
    }

    @Test
    public void findUser() throws Exception {
        System.out.println(userService.findUser(2).toString());
    }

    @Test
    public void login() throws Exception {

    }

}