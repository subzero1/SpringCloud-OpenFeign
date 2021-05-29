package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Configurable
@RequestMapping("/test")
public class TestController {

    @Autowired
    RestTemplate restTemplate;

    @ResponseBody
    @RequestMapping("/t1")
    public Map t1(){
        Map ss=new HashMap();
        ss.put("v1",new Date());
        ss.put("v2","嚯嚯嚯我是服务1");
        return  ss;
    }

    public Map t2(){
        Map ss=new HashMap();
        ss.put("v1",new Date());
        ss.put("v2","嚯嚯嚯");
        return  ss;
    }
}
