package com.wangling.designermode.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * 容器缓存，注册式单例的一种，是非线程安全的
 */
public class ContainerSingleton {
    private ContainerSingleton(){}

    private static Map<String,Object> ioc = new HashMap<String, Object>();

    public static Object getBean(String classname){
        synchronized (ioc) {
            if (!ioc.containsKey(classname)) {
                Object obj = null;
                try {
                    obj = Class.forName(classname).newInstance();
                    ioc.put(classname, obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return obj;

            } else {
                return ioc.get(classname);
            }
        }
    }
}
