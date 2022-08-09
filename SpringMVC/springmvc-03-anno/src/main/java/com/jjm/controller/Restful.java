package com.jjm.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author jjm
 * @version 1.0
 */
@Controller
public class Restful {
    @RequestMapping(value = "/add/{a}/{b}",method = RequestMethod.GET)
    public String test1(@PathVariable int a, @PathVariable int b, Model model){
        int result=a+b;
        model.addAttribute("msg","结果1是："+result);
        //默认转发
        return "hello";
    }
    @PostMapping("/add/{a}/{b}")
    public String test2(@PathVariable int a,@PathVariable int b,Model model){
        int result=a+b;
        model.addAttribute("msg","结果1是："+result);
        return "hello";
    }

    @RequestMapping("/m/t1")
    public String test3(Model model){
//        //转发 不需要视图解析器
//        return "forward:/index.jsp";
        //重定向
        return "redirect:/index.jsp";
    }
}
