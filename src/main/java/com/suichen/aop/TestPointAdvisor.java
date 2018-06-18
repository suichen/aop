package com.suichen.aop;

import org.aopalliance.aop.Advice;
import org.springframework.aop.Pointcut;
import org.springframework.aop.PointcutAdvisor;

public class TestPointAdvisor implements PointcutAdvisor {

    public Pointcut getPointcut() {
        return new TestPointcut();
    }

    public Advice getAdvice() {
        return new TestAfterAdvice();
    }

    public boolean isPerInstance() {
        return false;
    }
}
