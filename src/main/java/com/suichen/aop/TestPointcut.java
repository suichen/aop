package com.suichen.aop;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.MethodMatcher;
import org.springframework.aop.Pointcut;

import java.lang.reflect.Method;

public class TestPointcut implements Pointcut {
    public ClassFilter getClassFilter() {
        return ClassFilter.TRUE;
    }

    public MethodMatcher getMethodMatcher() {
        return new MethodMatcher() {
            public boolean matches(Method method, Class<?> targetClass) {
                if (method.getName().equals("test")) {
                    return true;
                }
                return false;
            }

            public boolean isRuntime() {
                return false;
            }

            public boolean matches(Method method, Class<?> targetClass, Object[] args) {
                if (method.getName().equals("test")) {
                    return true;
                }
                return false;
            }
        };
    }
}
