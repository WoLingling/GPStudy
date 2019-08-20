package com.wangling.designermode.proxy.sdkProxy;

import com.wangling.designermode.proxy.staticProxy.IOrderService;
import com.wangling.designermode.proxy.staticProxy.Order;
import com.wangling.designermode.proxy.staticProxy.OrderService;

import java.util.Date;

public class TestSdkProxy {
    public static void main(String[] args) {
        try{
            Person obj = (Person) new JDKMeipo().getInstance(new Customer());
            obj.findLover();

//            IOrderService orderService = (IOrderService)new OrderServiceDynamicProxy().getInstance(new OrderService());
//            Order order = new Order();
//            order.setCreateDate(new Date());
//            orderService.addOrder(order);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
