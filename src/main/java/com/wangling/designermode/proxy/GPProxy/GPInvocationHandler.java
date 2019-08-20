package com.wangling.designermode.proxy.GPProxy;

import java.lang.reflect.Method;

public interface GPInvocationHandler {
    public Object invoke(Object obj, Method method, Object[] args);
}
