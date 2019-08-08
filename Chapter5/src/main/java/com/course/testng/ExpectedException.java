package com.course.testng;

import org.testng.annotations.Test;

/**
 * @author zoro
 * @date 2019/8/8 0008 下午 5:24
 */
public class ExpectedException {
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeSuccess(){
        System.out.println("这是一个运行成功的运行异常测试");
        throw new RuntimeException();
    }
}
