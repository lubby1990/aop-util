package com.lubby.proxy;

import com.lubby.advice.IAdvice;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by liubin on 2015-12-14.
 */
public class DynamicProxy {

    public static <T> T newProxyInstance(T target, IAdvice advice) {
        ClassLoader loader = target.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();

        InvocationHandler handler = new ProxyHandler(target, advice);
        return (T) Proxy.newProxyInstance(loader, interfaces, handler);
    }

}
