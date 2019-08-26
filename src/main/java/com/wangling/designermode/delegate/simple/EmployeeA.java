package com.wangling.designermode.delegate.simple;

public class EmployeeA implements IEmployee {
    @Override
    public void doing(String command) {
        System.out.println("我是员工A，一名前端工程师，我来开发"+command);
    }
}
