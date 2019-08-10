package com.wangling.designermode.factory.abstractFactory.factory;

import com.wangling.designermode.factory.abstractFactory.product.IAirConditioner;
import com.wangling.designermode.factory.abstractFactory.product.IGeyser;
import com.wangling.designermode.factory.abstractFactory.product.IWashingMachine;

public interface IElectricalEquipmentFactory {
    IAirConditioner createAriConditioner();

    IGeyser createGeyser();

    IWashingMachine createWashingMachine();
}
