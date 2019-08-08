package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * @author zoro
 * @date 2019/8/8 0008 下午 5:07
 */
@Test(groups = "teacher")
public class GroupsOnClass3 {
    public void tea1(){
        System.out.println("这是groups on class3中的老师1方法运行");
    }
    public void tea2(){
        System.out.println("这是groups on class3中的老师2方法运行");
    }
}
