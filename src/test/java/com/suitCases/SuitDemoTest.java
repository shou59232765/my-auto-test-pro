package com.suitCases;

import com.junit4demo.Junit4Demo1;
import com.junit4demo.Junit4Demo2;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
* @Description:    RunWith 指定 测试运行的方式
 *
* @Author:         soso.he
* @CreateDate:     2020-11-01  01:12
* @UpdateUser:     soso.he
* @UpdateDate:     2020-11-01  01:12
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@RunWith(Suite.class)
@Suite.SuiteClasses({Junit4Demo2.class, Junit4Demo1.class})
public class SuitDemoTest {
}
