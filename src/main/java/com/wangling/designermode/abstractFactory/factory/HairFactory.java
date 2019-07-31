package com.wangling.designermode.abstractFactory.factory;

import com.wangling.designermode.abstractFactory.product.*;

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
