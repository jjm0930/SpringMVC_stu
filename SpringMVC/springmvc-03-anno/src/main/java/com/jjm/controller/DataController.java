package com.jjm.controller;

import com.jjm.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author jjm
 * @version 1.0
 */
@Controller
public class DataController {

    @RequestMapping("/data/t1")
    public String test1(User user, Model model){
        System.out.println(user);
        model.addAttribute("msg",user.getName());
        return "hello";
    }
}
