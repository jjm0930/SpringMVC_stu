package com.jjm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jjm
 * @version 1.0
 */
@Controller
@RequestMapping("/HelloController")
public class HelloController{
    //真实访问地址：/HelloController/hello
    @RequestMapping("/hello")
    public String sayHello(Model model){
        model.addAttribute("msg","Hello,SpringMVC!");
        return "hello";
    }
}
