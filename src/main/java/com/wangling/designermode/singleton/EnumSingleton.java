package com.wangling.designermode.singleton;

/**
 * 注册式单例，一种是容器缓存、一种是枚举登记
 * 反编译class文件会发现，枚举式单例在静态代码块中就给 INSTANCE 进行了赋值，是饿汉式单例的实现
 * 从jvm层面上就是防序列化和反射的，反射是不能破坏枚举式单例，底层判断是枚举抛出异常说不能用反射创建枚举
 */
public enum EnumSingleton {
    INSTANCE;

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }


    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
