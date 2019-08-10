package com.wangling.designermode.factory.factoryMethod;

import com.wangling.designermode.factory.comm.ICourse;

public class TestFactoryMethod {
    public static void main(String[] args) {

        ICourseFactory factory = new JavaFactory();
        ICourse course= factory.create();
        System.out.println(course.study());
    }
}
