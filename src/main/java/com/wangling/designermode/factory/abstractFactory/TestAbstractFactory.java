package com.wangling.designermode.factory.abstractFactory;

import com.wangling.designermode.factory.abstractFactory.factory.HairFactory;
import com.wangling.designermode.factory.abstractFactory.factory.IElectricalEquipmentFactory;
import com.wangling.designermode.factory.abstractFactory.product.IWashingMachine;

public class TestAbstractFactory {
    public static void main(String[] args) {
        // 工厂也抽象，产品族
        // 也不符合开闭原则，新增一个电器，工厂接口和实现类都得改
        IElectricalEquipmentFactory hairFactory = new HairFactory();
        IWashingMachine hairWashingMachine = hairFactory.createWashingMachine();
        hairWashingMachine.washClother();
    }
}
