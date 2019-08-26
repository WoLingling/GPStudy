package com.wangling.designermode.strategy.promotion;

public class GroupBuyStrategy implements IPromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("团购价优惠");
    }
}
