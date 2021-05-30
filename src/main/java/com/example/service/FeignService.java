package com.example.service;

import org.springframework.stereotype.Component;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Component
@FeignClient("EUREKA-CLIENT1")
public interface FeignService {
    @RequestMapping("/test/t1")
    public Map t1();
}
