package com.wangling.designermode.singleton;

import java.io.Serializable;

public class SerializableSingleton implements Serializable {
    private static final SerializableSingleton singleton = new SerializableSingleton();

    private SerializableSingleton(){}

    public static SerializableSingleton getInstance(){
        return singleton;
    }

    //实际上实例化了两次，只不过新创建的对象没有被返回而已，还是会消耗内存
    private Object readResolve(){
        return singleton;
    }
}
