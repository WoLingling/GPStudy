package com.wangling.designermode.strategy.promotion;

public class CashBackStrategy implements IPromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("现金返现优惠");
    }
}
