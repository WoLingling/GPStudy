package com.wangling.designermode.singleton;

/**
 * 静态内部类，在调用方法之前一定会先初始化内部类
 */
public class LazyInnerClassSingleton {
    private LazyInnerClassSingleton(){
        //防止反射破坏单例
        if (LazyHolder.singleton != null){
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    // static 使单例的空间共享；final 保证这个方法不被重写，重载
    public static final LazyInnerClassSingleton getInstance(){
        //在返回结果之前会先加载内部类
        return LazyHolder.singleton;
    }

    //默认不加载
    private static class LazyHolder{
        private static final LazyInnerClassSingleton singleton = new LazyInnerClassSingleton();
    }
}
