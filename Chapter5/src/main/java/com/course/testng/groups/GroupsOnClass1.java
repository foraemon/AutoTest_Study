package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * @author zoro
 * @date 2019/8/8 0008 下午 5:06
 */
@Test(groups = "student")
public class GroupsOnClass1 {
    public void stu1(){
        System.out.println("这是groups on class1中的学生1方法运行");
    }
    public void stu2(){
        System.out.println("这是groups on class1中的学生2方法运行");
    }
}
