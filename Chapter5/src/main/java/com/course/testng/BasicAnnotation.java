package com.course.testng;
import org.testng.annotations.*;

/**
 * @author zoro
 * @date 2019/8/8 0008 下午 4:06
 * 基本的测试标签
 */
public class BasicAnnotation {
    @Test
    public void testCase1(){
        System.out.println("这是测试用例一的运行方法");
    }
    @Test
    public void testCase2(){
        System.out.println("这是测试用例二的运行方法");
    }
    @BeforeMethod
    public void beforMethod(){
        System.out.println("这是在测试方法之前运行的方法");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("这是在测试方法之后运行的方法");
    }
    @BeforeClass
    public void beforClass(){
        System.out.println("这是在类之前运行的方法");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("这是在类之后运行的方法");
    }
    @BeforeSuite
    public void beforSuite(){
        System.out.println("这是在测试套件之前运行的方法");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("这是在测试套件之后运行的方法");
    }
}
