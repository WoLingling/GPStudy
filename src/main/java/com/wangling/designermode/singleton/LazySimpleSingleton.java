package com.wangling.designermode.singleton;

/**
 * 懒汉式单例（要的时候再创建）
 */
public class LazySimpleSingleton {
    private static LazySimpleSingleton singleton = null;

    private LazySimpleSingleton(){}

    // 加锁才会线程安全！
    public static synchronized LazySimpleSingleton getInstance(){
        if (singleton == null){
            singleton = new LazySimpleSingleton();
        }
        return singleton;
    }
}
