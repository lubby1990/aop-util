package com.lubby.test;

import com.lubby.advice.IAdvice;
import com.lubby.proxy.DynamicProxy;

/**
 * Created by liubin on 2015-12-14.
 */
public class Test {
    public static void main(String[] args) {
        ILogin login = new Login();
        IAdvice advice = new MyAdvice();
        ILogin proxy = DynamicProxy.newProxyInstance(login, advice);
        proxy.login();
    }
}
