package com.wangling.designermode.proxy.staticProxy;

public class OrderService implements IOrderService {

    private OrderDao orderDao;

    public OrderService(){
        orderDao = new OrderDao();
    }

    public void addOrder(Order order) {
        orderDao.addOrder(order);
    }
}
