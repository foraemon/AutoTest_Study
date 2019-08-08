package com.course.testng;

import org.testng.annotations.Test;

/**
 * @author zoro
 * @date 2019/8/8 0008 下午 6:56
 */
public class TimeOutTest {
    @Test(timeOut = 3000)
    public void testSuccess()throws InterruptedException{
        Thread.sleep(2000);
        System.out.println();
    }
    @Test(timeOut = 2000)
    public void testFailed()throws InterruptedException{
        Thread.sleep(3000);
    }
}
