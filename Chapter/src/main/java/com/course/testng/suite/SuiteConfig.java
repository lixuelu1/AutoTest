package com.course.testng.suite;

import org.testng.annotations.*;

public class SuiteConfig {
    @BeforeSuite
    public  void beforeSuite(){
        System.out.print("before suite运行了");
    }
    @AfterSuite
    public  void  afterSuite(){
        System.out.print("After suite 运行啦");

    }
    @BeforeTest
    public void  beforeTest(){
        System.out.print("beforeTest");
    }
    @AfterTest
    public  void  afterTest(){
        System.out.print("afterTest");
    }
}
