package com.wangling.designermode.proxy.GPProxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class GPMeipo implements GPInvocationHandler{
    private Object target;

    public Object getInstance(Object target){
        this.target = target;
        Class<?> clazz = target.getClass();
        return GPProxy.newProxyInstance(new GPClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {
        before();
        Object obj = null;
        try {
            obj = method.invoke(target,args);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
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
