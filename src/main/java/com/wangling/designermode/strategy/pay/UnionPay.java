package com.wangling.designermode.strategy.pay;

public class UnionPay extends Payment {
    @Override
    public String getName() {
        return "银联支付";
    }

    @Override
    protected double queryBalance(String uid) {
        return 10000;
    }
}
