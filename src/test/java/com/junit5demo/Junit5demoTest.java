package com.junit5demo;

import org.junit.Before;
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

@DisplayName("junit5演示类")
public class Junit5demoTest {

    @BeforeEach
    public void before(){
        System.out.println("in test BeforeEach");
    }

    @AfterEach
    public void after(){
        System.out.println("in test AfterEach");
    }

    @BeforeAll
    public static void BeforeAll(){
        System.out.println("in test BeforeAll");
    }

    @AfterAll
    public static void AfterAll(){
        System.out.println("in test AfterAll");
    }



    @Test
    @DisplayName("登录")
    public void test_001(){
        System.out.println("in test_001");
    }

    @Test
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
