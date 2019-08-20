package com.wangling.designermode.proxy.sdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class OrderServiceDynamicProxy implements InvocationHandler {
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
        System.out.println("OrderServiceStaticProxy：我先准备一下东西");
    }

    private void after(){
        System.out.println("OrderServiceStaticProxy：插入成功啦，收拾回啦");
    }
}
