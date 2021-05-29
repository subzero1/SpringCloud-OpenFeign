package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/test")
public class TestController {

    @ResponseBody
    @RequestMapping("/t1")
    public Map t1(){
        Map ss=new HashMap();
        ss.put("v1",new Date());
        ss.put("v2","嚯嚯嚯");
        return  ss;
    }
}
