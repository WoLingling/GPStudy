package com.wangling.designermode.strategy.pay;

public class TestPayStrategy {
    public static void main(String[] args) {
        Order order = new Order("s1","1",900);
        PayState payState = order.pay(PayStrategy.WECHAT_PAY);
        System.out.println(payState);
    }
}
