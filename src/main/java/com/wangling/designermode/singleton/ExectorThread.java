package com.wangling.designermode.singleton;

/**
 * 不知道这个类咋写的，要看视频或问老师？？？
 */
public class ExectorThread implements Runnable {
    public void run() {
//        LazySimpleSingleton lazySimpleSingleton = LazySimpleSingleton.getInstance();
//        System.out.println(Thread.currentThread().getName()+":"+lazySimpleSingleton);


        System.out.println(ThreadLocalSingleton.getInstance());
    }
}
