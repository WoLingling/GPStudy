package com.wangling.designermode.strategy.promotion;

public class PromotionActivity {
    private IPromotionStrategy promotion;

    public PromotionActivity(IPromotionStrategy promotion){
        this.promotion = promotion;
    }

    public void execute(){
        promotion.doPromotion();
    }
}
