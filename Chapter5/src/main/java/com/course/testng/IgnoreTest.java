package com.course.testng;

import org.testng.annotations.Test;

/**
 * @author zoro
 * @date 2019/8/8 0008 下午 4:46
 */
public class IgnoreTest {
    @Test
    public void ignore1(){
        System.out.println("ignore1 运行");
    }
    @Test(enabled = false)
    public void ignore2(){
        System.out.println("ignore2 执行");
    }
    @Test(enabled = true)
    public void ignore3(){
        System.out.println("ignore3 执行");
    }
}
