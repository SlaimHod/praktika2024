package model.system;

import model.equipment.SafetyEquipment;

public class SafetySystemManager {

    public void performEquipmentCheck(SafetyEquipment[] equipments) {
        for(SafetyEquipment equipment : equipments) {
            equipment.checkCondition();
        }
    }

    @Override
    public String toString() {
        return "SafetyCheckSystem{}";
    }

}