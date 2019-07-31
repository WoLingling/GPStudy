package com.wangling.designermode.abstractFactory.factory;

import com.wangling.designermode.abstractFactory.factory.IElectricalEquipmentFactory;
import com.wangling.designermode.abstractFactory.product.IAirConditioner;
import com.wangling.designermode.abstractFactory.product.IGeyser;
import com.wangling.designermode.abstractFactory.product.IWashingMachine;

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
