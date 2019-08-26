package com.wangling.designermode.strategy.pay;

import java.util.HashMap;
import java.util.Map;

public class PayStrategy {
    public static final String ALI_PAY = "AliPay";
    public static final String WECHAT_PAY = "WeChatPay";
    public static final String UNION_PAY = "UnionPay";
    public static final String DEFUALT_PAY = "DefaultPay";

    private static Map<String ,Payment> payStrategy = new HashMap<>();

    static{
        payStrategy.put(ALI_PAY,new AliPay());
        payStrategy.put(WECHAT_PAY,new WeChatPay());
        payStrategy.put(UNION_PAY,new UnionPay());
        payStrategy.put(DEFUALT_PAY,new AliPay());
    }

    public static Payment get(String payKey){
        if(!payStrategy.containsKey(payKey)){
            payKey = DEFUALT_PAY;
        }
        return payStrategy.get(payKey);
    }
}
