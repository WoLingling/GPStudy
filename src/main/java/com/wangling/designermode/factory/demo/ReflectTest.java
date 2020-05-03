package com.wangling.designermode.factory.demo;

import java.lang.reflect.Method;

public class ReflectTest {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("com.wangling.designermode.factory.demo.User");
            Method[] methods = clazz.getMethods();
            Object obj = clazz.newInstance();
            for (Method m: methods) {
                m.invoke(obj);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

class User{
    private String name;

    public void work(){
        System.out.println("User类的work方法被调用了");
    }
}