package com.course.testng;

import org.testng.annotations.Test;
//这是一个失败的异常测试
public class ExpectedException {
@Test(expectedExceptions = RuntimeException.class)
    public  void runtimeTimeExceptionfailed(){
        System.out.print("这是一个失败的异常测试");
    }
    //这是一个异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void  runtimeExctionSuccess(){
    System.out.print("这是我的异常测试");
     throw new RuntimeException();
    }
}
