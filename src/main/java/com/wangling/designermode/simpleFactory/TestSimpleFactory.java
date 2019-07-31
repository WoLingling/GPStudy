package com.wangling.designermode.simpleFactory;

import com.wangling.designermode.comm.ICourse;

public class TestSimpleFactory {
    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
//        ICourse course = factory.create("Java");
        ICourse course = factory.create("com.wangling.designermode.comm.JavaCourse");
        System.out.println(course.study());

//        ICourse course2 = factory.create(JavaCourse.class);
//        System.out.println(course2.study());
    }
}
