package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * @author zoro
 * @date 2019/8/8 0008 下午 4:23
 */
public class Suiteconfig {
    @BeforeSuite
    public void beforSuite(){
        System.out.println("before suite 方法运行");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("after suite 方法运行");
    }
    @BeforeTest
    public void beforTest(){
        System.out.println("测试用例运行前运行");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("测试用例运行后运行");
    }
}
