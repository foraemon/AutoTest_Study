package com.course.testng.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author zoro
 * @date 2019/8/8 0008 下午 5:41
 */
public class ParameterTest {
    @Test
    @Parameters({"name","age"})
    public void parameterTest1(String name,int age){
        System.out.println("name = " + name + " age = " + age);
    }
}
