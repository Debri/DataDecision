package com.geek.manager;

import com.geek.model.User;
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
public class UserMapperTest {
    @Resource
    UserMapper userDao;
    @Test
    public void addUser() throws Exception {
        Integer i=userDao.addUser(new User("刘奇213%&……","123"));
        assertEquals(i,new Integer(1));
    }

    @Test
    public void deleteUserById() throws Exception {

    }

    @Test
    public void modifyUser() throws Exception {

    }

    @Test
    public void findUserById() throws Exception {

    }

    @Test
    public void findAll() throws Exception {

    }

}