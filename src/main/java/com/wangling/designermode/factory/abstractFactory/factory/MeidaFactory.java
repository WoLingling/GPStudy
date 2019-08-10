package com.wangling.designermode.factory.abstractFactory.factory;

import com.wangling.designermode.factory.abstractFactory.product.IAirConditioner;
import com.wangling.designermode.factory.abstractFactory.product.IGeyser;
import com.wangling.designermode.factory.abstractFactory.product.IWashingMachine;

public class MeidaFactory implements IElectricalEquipmentFactory {
    public IAirConditioner createAriConditioner() {
        return null;
    }

    public IGeyser createGeyser() {
        return null;
    }

    public IWashingMachine createWashingMachine() {
        return null;
    }
}
