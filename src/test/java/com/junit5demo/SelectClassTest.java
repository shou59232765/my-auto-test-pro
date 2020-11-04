package com.junit5demo;


import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;


@RunWith(JUnitPlatform.class)
@SelectClasses(Junit5demo1Test.class)
//@IncludeTags("devdemo")
@ExcludeTags("devdemo")
public class SelectClassTest {
}
