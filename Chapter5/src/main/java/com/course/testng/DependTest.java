package com.course.testng;

import org.testng.annotations.Test;

/**
 * @author zoro
 * @date 2019/8/8 0008 下午 5:33
 */
public class DependTest {
    @Test
    public void test1(){
        System.out.println("test1 run");
    }
    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 run");
    }
    @Test
    public void test3(){
        System.out.println("test3 run");
        throw new RuntimeException();
    }
    @Test(dependsOnMethods = {"test3"})
    public void test4(){
        System.out.println("test4 run");
    }
}
