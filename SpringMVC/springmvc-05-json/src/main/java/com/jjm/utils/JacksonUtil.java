package com.jjm.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.text.SimpleDateFormat;

/**
 * @author jjm
 * @version 1.0
 */
public class JacksonUtil {

    public static String getJSON(Object o){
        return getJSON(o,"yyyy-MM-dd HH:mm:ss");
    }
    public static String getJSON(Object o,String dateFormat){
        ObjectMapper objectMapper = new ObjectMapper();
        //不使用时间差的方式
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);

        //自定义日期格式对象
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        //指定日期格式
        objectMapper.setDateFormat(sdf);
        try {
            return objectMapper.writeValueAsString(o);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
