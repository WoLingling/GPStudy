package com.wangling.designermode.strategy.pay;

public class AliPay extends Payment {
    @Override
    public String getName() {
        return "支付宝支付";
    }

    @Override
    protected double queryBalance(String uid) {
        return 800;
    }
}
