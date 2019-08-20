package com.wangling.designermode.proxy.staticProxy;

public class OrderServiceStaticProxy implements IOrderService {

    private IOrderService orderService;

    public OrderServiceStaticProxy(IOrderService orderService){
        this.orderService = orderService;
    }

    public void addOrder(Order order) {
        before();
        orderService.addOrder(order);
        after();
    }

    private void before(){
        System.out.println("OrderServiceStaticProxy：我先准备一下东西");
    }

    private void after(){
        System.out.println("OrderServiceStaticProxy：插入成功啦，收拾回啦");
    }
}
