package com.course.testng.multiThread;

import org.testng.annotations.Test;

/**
 * @author zoro
 * @date 2019/8/8 0008 下午 6:21
 */
public class MultiThreadOnAnnotation {

    @Test(invocationCount = 10,threadPoolSize = 3)
        public void test(){
            System.out.println(1);
            System.out.printf("Thread ID : %s%n",Thread.currentThread().getId());
        }
    }

