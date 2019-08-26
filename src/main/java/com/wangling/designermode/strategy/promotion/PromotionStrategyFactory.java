package com.wangling.designermode.strategy.promotion;

import java.util.HashMap;
import java.util.Map;

/**
 * 结合单例模式和工厂模式，创建 促销策略工厂
 */
public class PromotionStrategyFactory {
    private static Map<String ,IPromotionStrategy> PROMATION_STRATEGY_MAP = new HashMap<>();

    static {
        PROMATION_STRATEGY_MAP.put(PromotionKey.COUPON,new CouponStrategy());
        PROMATION_STRATEGY_MAP.put(PromotionKey.CASHBACK, new CashBackStrategy());
        PROMATION_STRATEGY_MAP.put(PromotionKey.GROUPBUY, new GroupBuyStrategy());
    }

    private static IPromotionStrategy NO_PROMOTION = new EmptyStrategy();

    private PromotionStrategyFactory(){}

    public static IPromotionStrategy getPromotionStrategy(String promotionKey){
        IPromotionStrategy strategy = PROMATION_STRATEGY_MAP.get(promotionKey);
        return strategy == null ? NO_PROMOTION : strategy;
    }

    private interface PromotionKey{
        String COUPON = "COUPON";
        String CASHBACK = "CASHBACK";
        String GROUPBUY = "GROUPBUY";
    }
}
