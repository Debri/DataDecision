package com.geek.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Liuqi
 * Date: 2016/10/24.
 */

/**
 * 自定义的异常处理器
 */
public class CustomExceptionHandler implements HandlerExceptionResolver {
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        CustomException exception = null;
        if (e instanceof CustomException) {
            exception = (CustomException) e;
        } else {
            exception = new CustomException("未知错误");
        }
        String message = exception.getMessage();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg", message);
        modelAndView.setViewName("error");
        return modelAndView;
    }
}
