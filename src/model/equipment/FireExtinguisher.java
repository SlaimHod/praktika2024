package model.equipment;

public class FireExtinguisher extends SafetyEquipment {

    private final int chargeLevel;

    public FireExtinguisher(String name, String manufacturer, int year, int  month, int date, int chargeLevel) {
        super(name, manufacturer, year, month, date);
        this.chargeLevel = chargeLevel;
    }

    @Override
    public String toString() {
        return "FireExtinguisher{chargeLevel=" + chargeLevel + "}";
    }

    @Override
    public void checkCondition() {
        // дополнительная проверка состояния огнетушителя
    }
}