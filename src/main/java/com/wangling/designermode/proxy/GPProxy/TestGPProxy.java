package com.wangling.designermode.proxy.GPProxy;

import com.wangling.designermode.proxy.sdkProxy.Customer;
import com.wangling.designermode.proxy.sdkProxy.Person;

public class TestGPProxy {
    public static void main(String[] args) {
        try {
            Person obj = (Person) new GPMeipo().getInstance(new Customer());
            System.out.println(obj.getClass());
            obj.findLover();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
