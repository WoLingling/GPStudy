package com.wangling.designermode.factory.abstractFactory.factory;

import com.wangling.designermode.factory.abstractFactory.product.*;

public class HairFactory implements IElectricalEquipmentFactory {
    public IAirConditioner createAriConditioner() {
        return new HairAirConditioner();
    }

    public IGeyser createGeyser() {
        return new HairGeyser();
    }

    public IWashingMachine createWashingMachine() {
        return new HairWashingMachine();
    }
}
