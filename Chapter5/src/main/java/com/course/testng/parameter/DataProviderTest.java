package com.course.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * @author zoro
 * @date 2019/8/8 0008 下午 5:54
 */
public class DataProviderTest {
    @Test(dataProvider = "data")
    public void dataProviderTest(String name,int age){
        System.out.println("name = " + name + " age = " + age);
    }
    @DataProvider(name = "data")
    public Object[][] providerData(){
        Object[][] o = new Object[][]{
                {"张三",18},
                {"李四",28},
                {"王五",38}
        };
        return o;
    }
    @Test(dataProvider = "methodData")
    public void test1(String name,int age){
        System.out.println("test1中的 name = " + name + " age = " + age);
    }
    @Test(dataProvider = "methodData")
    public void test2(String name,int age){
        System.out.println("test2中的 name = " + name + " age = " + age);
    }
    @DataProvider(name = "methodData")
    public Object[][]methodDataTest(Method method){
        Object[][] result = null;
        if (method.getName().equals("test1")){
            result = new Object[][]{
                    {"张三",20},
                    {"李四",30}
            };
        }else if (method.getName().equals("test2")){
            result = new Object[][]{
                    {"王五",40},
                    {"赵柳",50}
            };
        }
        return result;
    }
}
