package com.lubby.advice;

/**
 * Created by liubin on 2015-12-14.
 */

/**
 * Advice for aop.
 * You can execute [before] or [after] the method
 */
public interface IAdvice {
    void executeBefore();

    void executeAfter();

}
