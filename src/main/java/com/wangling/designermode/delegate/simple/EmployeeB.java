package com.wangling.designermode.delegate.simple;

public class EmployeeB implements IEmployee {
    @Override
    public void doing(String command) {
        System.out.println("我是员工B，一名Android工程师，我来开发"+command);
    }
}
