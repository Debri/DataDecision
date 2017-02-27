package com.geek.manager;

import com.geek.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Liuqi
 * Date: 2016/10/22.
 */
@Repository("useDao")
public interface UserMapper {
    public Integer addUser(User user);

    public Integer deleteUserById(Integer id);

    public Integer modifyUser(User user);
    public User findUserById(Integer id);

    public List<User> findAll();
}
