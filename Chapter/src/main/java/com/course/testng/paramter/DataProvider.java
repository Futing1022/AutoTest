package com.course.testng.paramter;

import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProvider {


    @Test(dataProvider = "data")
    public void testDataProvider(String name, int age) {
        System.out.println("name=" + name + "; age=" + age);
    }

    @org.testng.annotations.DataProvider(name = "data")
    public Object[][] providerData() {
        Object[][] objects = new Object[][]{
                {"zhangsan", 10},
                {"lisi", 20},
                {"wangwu", 30}
        };
        return objects;
    }

    @Test(dataProvider = "methodData")
    public void test1(String name, int age) {
        System.out.println("test1---> name=" + name + "; age=" + age);
    }

    @Test(dataProvider = "methodData")
    public void test2(String name, int age) {
        System.out.println("test2---> name=" + name + "; age=" + age);
    }

    @org.testng.annotations.DataProvider(name = "methodData")
    public Object[][] methodDataTest(Method method) {
        Object[][] o = null;
        if (method.getName().equals("test1")) {
            o=new Object[][]{
                    {"zhangsan", 90},
                    {"lisi", 80},

            };
        } else if (method.getName().equals("test2")) {
            o=new Object[][]{
                    {"wangwu", 11},
                    {"zhaliu", 22},

            };
        }
        return o;
    }
}
