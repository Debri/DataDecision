package com.geek.controller;

import com.geek.model.User;
import com.geek.service.UserService;
import com.geek.util.JSONUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Liuqi
 * Date: 2016/10/22.
 */
@Controller("userController")
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/register.do")
    public ModelAndView register(User user, HttpServletRequest request, HttpServletResponse response) {
        //System.out.println("------------user----------");
        ModelAndView view = new ModelAndView("index");
        boolean b = userService.addUser(user);
        JSONUtils.toJSON(new User("你好", "好的"), response);
        return view;
    }

    @RequestMapping(value = "/findUser.do")
    public void findUser(Integer id, HttpServletResponse response) {
        JSONUtils.toJSON(userService.findUser(id), response);
    }
}
