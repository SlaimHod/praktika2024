package model.equipment;

import java.time.LocalDate;

public class SafetyEquipment {

    private final String name;
    private final String manufacturer;
    private final LocalDate manufacturingDate;

    public SafetyEquipment(String name, String manufacturer, int year, int  month, int date) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.manufacturingDate = LocalDate.of(year, month, date);
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public LocalDate getManufacturingDate() {
        return manufacturingDate;
    }

    @Override
    public String toString() {
        return "SafetyEquipment{name='" + name + "', manufacturer='" + manufacturer + "', manufacturingDate=" + manufacturingDate + "}";
    }

    public void checkCondition() {
        // реализация проверки состояния устройства
    }
}