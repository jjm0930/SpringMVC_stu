package com.jjm.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author jjm
 * @version 1.0
 */
public class HelloController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView();

        //封装对象，放在ModelAndView中。Model
        modelAndView.addObject("msg","HelloSpringMVC!");

        //封装要跳转的视图，放在ModelAndView中

        modelAndView.setViewName("hello"); //: /WEB-INF/jsp/hello.jsp
        return modelAndView;
    }
}
