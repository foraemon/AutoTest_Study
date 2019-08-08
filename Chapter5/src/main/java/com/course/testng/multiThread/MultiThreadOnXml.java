package com.course.testng.multiThread;

import org.testng.annotations.Test;

/**
 * @author zoro
 * @date 2019/8/8 0008 下午 6:33
 */
public class MultiThreadOnXml {
    @Test
    public void test1(){
        System.out.printf("Thread ID : %s%n",Thread.currentThread().getId());
    }
    @Test
    public void test2(){
        System.out.printf("Thread ID : %s%n",Thread.currentThread().getId());
    }
    @Test
    public void test3(){
        System.out.printf("Thread ID : %s%n",Thread.currentThread().getId());
    }

}
