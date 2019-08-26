package com.wangling.designermode.strategy.promotion;

public class EmptyStrategy implements IPromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("没有优惠，原价");
    }
}
