package com.wangling.designermode.abstractFactory.factory;

import com.wangling.designermode.abstractFactory.product.IAirConditioner;
import com.wangling.designermode.abstractFactory.product.IGeyser;
import com.wangling.designermode.abstractFactory.product.IWashingMachine;

public interface IElectricalEquipmentFactory {
    IAirConditioner createAriConditioner();

    IGeyser createGeyser();

    IWashingMachine createWashingMachine();
}
