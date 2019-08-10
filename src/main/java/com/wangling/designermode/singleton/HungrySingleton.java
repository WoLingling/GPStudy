package com.wangling.designermode.singleton;

import java.io.Serializable;

/**
 * 饿汉式单例（吃饱再说，先创建）
 */
public class HungrySingleton{
    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

//    private static final HungrySingleton hungrySingleton;
//
//    static {
//        hungrySingleton = new HungrySingleton();
//    }
//
//    private HungrySingleton(){}
//
//    public static HungrySingleton getInstance(){
//        return hungrySingleton;
//    }
}
