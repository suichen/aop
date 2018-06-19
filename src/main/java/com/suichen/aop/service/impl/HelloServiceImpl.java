package com.suichen.aop.service.impl;

import com.suichen.aop.service.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    public Object testHello() {
        System.out.println("hello");
        return "byte";
    }
}
