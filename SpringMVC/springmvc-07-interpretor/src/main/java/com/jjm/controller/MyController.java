package com.jjm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * @author jjm
 * @version 1.0
 */
@Controller
public class MyController {

    @RequestMapping("/main")
    public String test1(){
        return "main";
    }

    @RequestMapping("/toLogin")
    public String test2(){
        return "login";
    }

    @RequestMapping("/goLogin")
    public String test3(@RequestParam("username")String name, HttpSession session, Model model){
        if(name!=null){
            session.setAttribute("userInfo",name);
            model.addAttribute("msg",name);
        }
        return "main";
    }
}
