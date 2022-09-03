package com.example.controller;

import com.example.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@Configuration
@RequestMapping("/test")
public class TestController {


    @Autowired
    private FeignService feignService;

    @RequestMapping("/t1")
    public Map t1() {
        Map ss = new HashMap();
        ss.put("v1", new Date());
        ss.put("v2", "嚯嚯嚯我是服务2");
        return ss;
    }

    @RequestMapping("/t2")
    public Map t2() {
//        Map body = restTemplate.getForObject("http://EUREKA-CLIENT1/test/t1", Map.class);
        Map body = feignService.t1();
        body.put("k2", "TMD终于调用成功了，真tm不容易");
        return body;
    }

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @RequestMapping("/t3")
    public Map t3() {
        Map body = restTemplate.getForObject("http://EUREKA-CLIENT1/test/t1", Map.class);
        return body;
    }
}
