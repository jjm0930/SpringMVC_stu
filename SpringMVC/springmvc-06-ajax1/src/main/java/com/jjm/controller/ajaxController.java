package com.jjm.controller;

import com.alibaba.fastjson.JSON;
import com.jjm.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author jjm
 * @version 1.0
 */
@Controller
public class ajaxController {
    @RequestMapping("/test1")
    public String test(){

        return "test";
    }

    @RequestMapping("/test2")
    public void test1(String name, HttpServletResponse response) throws IOException {
        if(name.equals("关羽")){
            response.getWriter().print("true");
        }else {
            response.getWriter().print("false");
        }
    }

    @RequestMapping( "/test3")
    public void test2(String name, HttpServletResponse response) throws IOException {
        User user = new User("哈罗1号", 200, "中性");
        User user1 = new User("哈罗2号", 201, "中性");
        User user2= new User("哈罗3号", 201, "中性");
        User user3 = new User("哈罗4号", 230, "中性");
        User user4 = new User("哈罗5号", 240, "中性");
        List<User> list=new ArrayList<>();
        list.add(user);
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        String string = JSON.toJSONString(list);
        response.setCharacterEncoding("utf-8");
        response.getWriter().print(string);
    }
    @ResponseBody()
    @RequestMapping("/test4")
    public String test3(){
        User user = new User("哈罗1号", 200, "中性");
        User user1 = new User("哈罗2号", 201, "中性");
        User user2= new User("哈罗3号", 201, "中性");
        User user3 = new User("哈罗4号", 230, "中性");
        User user4 = new User("哈罗5号", 240, "中性");
        List<User> list=new ArrayList<>();
        list.add(user);
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        return JSON.toJSONString(list);
    }


}
