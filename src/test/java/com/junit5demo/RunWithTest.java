package com.junit5demo;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(JUnitPlatform.class)
@SelectPackages({"com"})
//@Suite.SuiteClasses("com.junit5demo.NestedTest")
@IncludePackages({"com.junit5demo","com.junit4demo"})
public class RunWithTest {



}
