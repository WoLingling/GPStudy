package com.wangling.designermode.proxy.sdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKMeipo implements InvocationHandler {
    private Object target;

    public Object getInstance(Object target){
        this.target = target;

        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(target,args);
        after();
        return obj;
    }

    private void before(){
        System.out.println("我是媒婆，准备材料帮你物色");
    }

    private void after(){
        System.out.println("双方都🆗，准备喜事啦！");
    }
}
