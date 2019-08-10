package com.wangling.designermode.singleton;

import java.lang.reflect.Constructor;

public class TestReflectBrokenSingleton {
    public static void main(String[] args) {

        LazyInnerClassSingleton obj = LazyInnerClassSingleton.getInstance();


        Class clazz = LazyInnerClassSingleton.class;
        try {
            Constructor c = clazz.getDeclaredConstructor();
            c.setAccessible(true);
            Object obj1 = c.newInstance();
            System.out.println("obj1:"+obj);
            Object obj2 = c.newInstance();
            System.out.println("obj2:"+obj2);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
