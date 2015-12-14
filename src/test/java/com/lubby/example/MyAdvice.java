package com.lubby.example;

import com.lubby.advice.IAdvice;

/**
 * Created by liubin on 2015-12-14.
 */
public class MyAdvice implements IAdvice {
    public void executeBefore() {
        System.out.println("before method doing something....");
    }

    public void executeAfter() {
        System.out.println("after method doing something....");

    }
}
