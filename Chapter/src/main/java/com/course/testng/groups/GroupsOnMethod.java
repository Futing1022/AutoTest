package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {

    @Test(groups = "server")
    public void test1() {
        System.out.println("这是服务端组1111");
    }

    @Test(groups = "server")
    public void test2() {
        System.out.println("这是服务端组2222");

    }

    @Test(groups = "client")
    public void test3() {
        System.out.println("这是客户端组3333");
    }

    @Test(groups = "client")
    public void test4() {
        System.out.println("这是客户端组4444");

    }

    @BeforeGroups("server")
    public void beforeGroups() {
        System.out.println("这是服务端组执行之前的方法");
    }

    @AfterGroups("server")
    public void afterGroups() {
        System.out.println("这是服务端组执行之后的方法！！！！");
    }

    @BeforeGroups("client")
    public void beforeGroups1() {
        System.out.println("这是客户端组执行之前的方法");
    }

    @AfterGroups("client")
    public void afterGroups1() {
        System.out.println("这是客户端组执行之后的方法！！！！");
    }

}
