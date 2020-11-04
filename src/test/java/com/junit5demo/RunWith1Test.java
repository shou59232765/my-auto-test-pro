package com.junit5demo;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludePackages;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages({"com"})
//@Suite.SuiteClasses("com.junit5demo.NestedTest")
@ExcludePackages({"com.junit5demo"})
public class RunWith1Test {



}
