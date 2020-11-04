package com.junit5demo;

import org.junit.jupiter.api.*;

/**
* @Description:    junit5演示类
* @Author:         soso.he
* @CreateDate:     2020-11-01  09:36
* @UpdateUser:     soso.he
* @UpdateDate:     2020-11-01  09:36
* @UpdateRemark:   修改内容
* @Version:        1.0
*/

@DisplayName("junit5演示类1")
public class Junit5demo1Test {


    @Test
    @Tag("devdemo")
    @DisplayName("登录")
    public void test_001(){
        System.out.println("in test_001");
    }

    @Test
    @Tag("devdemo")
    @DisplayName("登录")
    public void test_005(){
        System.out.println("in test_005");
    }

    @Test
    @Tag("prodemo")
    @DisplayName("登录2")
    public void test_004(){
        System.out.println("in test_004");
    }

    @Test
    @Tag("fatdemo")
    @DisplayName("支付")
    @RepeatedTest(5) //重复执行5次
    public void test_003(){
        System.out.println("当前线程："+Thread.currentThread().getName());
        System.out.println("in test_003");
    }

    @Test
    @Disabled
    public void test_002(){
        System.out.println("in test_002");
    }

}
