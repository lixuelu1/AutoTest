package com.course.testng;

import org.testng.annotations.Test;

public class TimeoutTest {
    @Test(timeOut = 3000)//单位毫秒
    public void testSucesses() throws InterruptedException {
        Thread.sleep(1000);
    }
    @Test(timeOut = 3000)//单位毫秒
    public void testFaied() throws InterruptedException {
        Thread.sleep(5000);
    }

}
