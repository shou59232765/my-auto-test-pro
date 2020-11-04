package com.param;


import com.wld.pro.Calculator;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

/**
* @Description:    冒烟测试
* @Author:         soso.he
* @CreateDate:     2020-11-05  00:23
* @UpdateUser:     soso.he
* @UpdateDate:     2020-11-05  00:23
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class CalculatorTest {

    @Test
    public void testAdd() {
        Assert.assertEquals("加法测试",4,Calculator.add(2,2));
    }

    @Test
    public void testJianfa() {
        Assert.assertEquals("减法测试",4,Calculator.jianfa(6,2));
    }

    @Test
    public void testShengfa() {
        Assert.assertEquals("乘法测试",4,Calculator.shengfa(2,2));
    }

    @Test
    public void testChufa() {
        Assert.assertEquals("除法测试",3,Calculator.chufa(6,2));
    }

    @Test
    public void testLeijia() {
        Assert.assertEquals("累加测试",7,Calculator.leijia(6));
    }
}