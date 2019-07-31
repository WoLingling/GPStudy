package com.wangling.designermode.abstractFactory.product;

import com.wangling.designermode.abstractFactory.product.IWashingMachine;

public class HairWashingMachine implements IWashingMachine {
    public void washClother() {
        System.out.println("洗衣机在洗衣服");
    }
}
