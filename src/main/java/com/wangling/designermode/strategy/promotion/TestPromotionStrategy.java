package com.wangling.designermode.strategy.promotion;


public class TestPromotionStrategy {
    public static void main(String[] args) {
        PromotionActivity activity = null;

        String promotionKey = "CASHBACK";

//        if(promotionKey.equals("GROPUPBUY")){
//            activity = new PromotionActivity(new GroupBuyStrategy());
//            activity.execute();
//        }else if(promotionKey.equals("CASHBACK")){
//            activity = new PromotionActivity(new CashBackStrategy());
//            activity.execute();
//        }

        activity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
        activity.execute();
    }
}
