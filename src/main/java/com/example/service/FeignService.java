package com.example.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Component
@FeignClient("EUREKA-CLIENT1")
public interface FeignService {
    @RequestMapping("/test/t1")
    public Map t1();
}
