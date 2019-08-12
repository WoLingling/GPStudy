package com.wangling.designermode.other;

/**
 * 内部类的执行顺序 测试类
 * 静态-->成员实例 -->构造方法
 *
 */
public class Test {
    public static void main(String[] args) {
        new Dog();
    }

}

class Animal{
    static{
        System.out.println("animal static....");
    }

    public Animal(){
        System.out.println("animal constructor...");
    }
}

class Dog extends Animal{
    Cat cat = new Cat();
    public Dog(){
        System.out.println("dog constructor.......");
    }
    static{
        System.out.println("dog static ..");
    }
}

class Cat extends Animal{
    public Cat(){
        System.out.println("cat constructor....");
    }
    static{
        System.out.println("cat static......");
    }
}

