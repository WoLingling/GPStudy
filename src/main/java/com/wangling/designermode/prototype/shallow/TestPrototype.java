package com.wangling.designermode.prototype.shallow;

import java.util.ArrayList;
import java.util.List;

public class TestPrototype {

    public static void main(String[] args) {

        PrototypeA prototype = new PrototypeA();
        prototype.setName("wangling");
        prototype.setAge(18);
        List<String> hobbies = new ArrayList<String>();
        hobbies.add("drawing");
        prototype.setHobbies(hobbies);

        PrototypeA copyA = (PrototypeA)prototype.clone();

        System.out.println("prototype: "+prototype);
        System.out.println("copyA: "+copyA);//false

        // 引用类型的地址值是一样的
        System.out.println("prototype: "+prototype.getHobbies());
        System.out.println("copyA: "+copyA.getHobbies());
        System.out.println(prototype.getHobbies() == copyA.getHobbies());//true

        System.out.println(prototype.getName() == copyA.getName());//true

//        String name = copyA.getName();
//        name = "jack";
//        copyA.setName(name);
//        System.out.println(prototype.getName());//wangling

        List<String> hobby = copyA.getHobbies();
        hobby.add("swimming");
        System.out.println(copyA.getHobbies());//[drawing, swimming]
        System.out.println(prototype.getHobbies());//[drawing, swimming]
    }


}
