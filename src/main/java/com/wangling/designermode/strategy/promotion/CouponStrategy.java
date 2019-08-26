package com.wangling.designermode.strategy.promotion;

public class CouponStrategy implements IPromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("优惠券抵扣");
    }
}
