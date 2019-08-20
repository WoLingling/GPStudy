package com.wangling.designermode.proxy.staticProxy;

public class OrderDao {

    public int addOrder(Order order){
        System.out.println("OrderDao:   正在插入数据");
        return 1;
    }
}
