package com.suichen.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aop {
    @Around("execution(* com.suichen.aop.service.impl.*Impl.test2*(..))")
    public void test2(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("hello before");
        pjp.proceed();
        System.out.println("hello after");
    }
    @Around("execution(* com.suichen.aop.service.impl.*Impl.test*(..))")
    public Object test(ProceedingJoinPoint pjp) throws Throwable{
        System.out.println("hello before");
        Object result = pjp.proceed();
        System.out.println("hello after");
        return result;
    }
}
