package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "teater")
public class GroupsOnClass3 {
    public  void  teater1(){
        System.out.print("GroupsOnClass3333中的teacher1运行");
    }
    public  void  teater2(){
        System.out.print("GroupsOnClass3333中的teacher2运行");
    }

}
