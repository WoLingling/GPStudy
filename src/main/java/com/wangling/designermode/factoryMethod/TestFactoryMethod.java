package com.wangling.designermode.factoryMethod;

import com.wangling.designermode.comm.ICourse;

public class TestFactoryMethod {
    public static void main(String[] args) {

        ICourseFactory factory = new JavaFactory();
        ICourse course= factory.create();
        System.out.println(course.study());
    }
}
