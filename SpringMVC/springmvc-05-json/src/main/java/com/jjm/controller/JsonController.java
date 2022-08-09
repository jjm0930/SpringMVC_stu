package com.jjm.controller;



import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jjm.pojo.User;
import com.jjm.utils.JacksonUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author jjm
 * @version 1.0
 */
//@Controller
@RestController//不走视图解析器
public class JsonController {

    @RequestMapping("/json1")
    //@ResponseBody//不走视图解释器直接返回字符串
    public String test1() throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();
        User user = new User("哈罗1号", 200, "中性");
        String str = objectMapper.writeValueAsString(user);
        return str;
    }

    @RequestMapping("/json2")
    public String test2(){
        Date date = new Date();
        return JacksonUtil.getJSON(date);
    }

    @RequestMapping("/json3")
    //@ResponseBody//不走视图解释器直接返回字符串
    public String test3() throws JsonProcessingException {

        List<User> users=new ArrayList<>();
        User user = new User("哈罗1号", 200, "中性");
        User user1 = new User("哈罗2号", 201, "中性");
        User user2= new User("哈罗3号", 201, "中性");
        User user3 = new User("哈罗4号", 230, "中性");
        User user4 = new User("哈罗5号", 240, "中性");
        users.add(user);
        users.add(user2);
        users.add(user3);
        users.add(user1);
        users.add(user4);

        return JacksonUtil.getJSON(users);

    }

    @RequestMapping("/json5")
    //@ResponseBody//不走视图解释器直接返回字符串
    public String test4() throws JsonProcessingException {

        List<User> users=new ArrayList<>();
        User user = new User("哈罗1号", 200, "中性");
        User user1 = new User("哈罗2号", 201, "中性");
        User user2= new User("哈罗3号", 201, "中性");
        User user3 = new User("哈罗4号", 230, "中性");
        User user4 = new User("哈罗5号", 240, "中性");
        users.add(user);
        users.add(user2);
        users.add(user3);
        users.add(user1);
        users.add(user4);

        System.out.println("*******Java对象 转 JSON字符串*******");
        String str1 = JSON.toJSONString(users);
        System.out.println("JSON.toJSONString(list)==>"+str1);
        String str2 = JSON.toJSONString(user1);
        System.out.println("JSON.toJSONString(user1)==>"+str2);

        System.out.println("\n****** JSON字符串 转 Java对象*******");
        User jp_user1=JSON.parseObject(str2,User.class);
        System.out.println("JSON.parseObject(str2,User.class)==>"+jp_user1);

        System.out.println("\n****** Java对象 转 JSON对象 ******");
        JSONObject jsonObject1 = (JSONObject) JSON.toJSON(user2);
        System.out.println("(JSONObject) JSON.toJSON(user2)==>"+jsonObject1.getString("name"));

        System.out.println("\n****** JSON对象 转 Java对象 ******");
        User to_java_user = JSON.toJavaObject(jsonObject1, User.class);
        System.out.println("JSON.toJavaObject(jsonObject1, User.class)==>"+to_java_user);
        return JSON.toJSONString(users);

    }
}
