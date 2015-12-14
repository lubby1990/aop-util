package com.lubby.proxy;

import com.lubby.advice.IAdvice;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by liubin on 2015-12-14.
 */
public class ProxyHandler implements InvocationHandler {
    Object target;
    IAdvice advice;

    public ProxyHandler(Object target, IAdvice advice) {
        this.target = target;
        this.advice = advice;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        advice.executeBefore();
        Object obj = method.invoke(this.target, args);
        advice.executeBefore();
        return obj;
    }
}
