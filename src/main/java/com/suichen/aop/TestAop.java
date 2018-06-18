package com.suichen.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestAop {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("classpath*:beans.xml");
        TestTarget target = (TestTarget) applicationContext.getBean("testAOP");
        target.test();
        System.out.println("=====================");
        target.test2();
    }
}
