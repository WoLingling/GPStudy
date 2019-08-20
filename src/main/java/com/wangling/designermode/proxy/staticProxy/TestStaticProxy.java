package com.wangling.designermode.proxy.staticProxy;

import java.util.Date;

public class TestStaticProxy {


    public static void main(String[] args) {
        Order order = new Order();
        order.setCreateDate(new Date());

        OrderServiceStaticProxy proxyOrderService = new OrderServiceStaticProxy(new OrderService());
        proxyOrderService.addOrder(order);

    }
}
