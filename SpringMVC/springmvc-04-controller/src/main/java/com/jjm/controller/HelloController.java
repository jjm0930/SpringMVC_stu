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
public class HelloController {

    @RequestMapping("/hello")
    public String sayHelloController(Model model){
        model.addAttribute("msg","Hello,Controller");
        return "test";
    }
}
