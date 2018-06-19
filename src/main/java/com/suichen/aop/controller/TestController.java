package com.suichen.aop.controller;

import com.suichen.aop.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {
    @RequestMapping("/hello")
    public Object testController() {
        return helloService.testHello();
    }

    @Resource
    private HelloService helloService;
}
