package com.wangling.designermode.singleton;

public class TestThreadLocalSingleton {
    public static void main(String[] args) {
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());

        Thread thread1 = new Thread(new ExectorThread());
        Thread thread2= new Thread(new ExectorThread());
        System.out.println(thread1);
        System.out.println(thread2);

    }
}
