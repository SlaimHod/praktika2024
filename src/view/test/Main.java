package view.test;

import model.equipment.FireExtinguisher;
import model.system.SafetySystemManager;
import model.equipment.SafetyEquipment;

import java.util.Calendar;

public class Main {

    // TODO создать класс для инструктажа, создать класс для инструктируемых и инструктора и дата инструктажа | ВЫПОЛНЕНО

    public static void main(String[] args) {
        // Создание объектов огнетушителей
        FireExtinguisher fireExtinguisher1 = new FireExtinguisher("Fire Extinguisher 1", "ABC Fire", 2020, Calendar.JULY, 15, 80);
        FireExtinguisher fireExtinguisher2 = new FireExtinguisher("Fire Extinguisher 2", "Fire Safety Ltd", 2019, Calendar.JUNE, 20, 60);

        // Создание массива техники безопасности
        SafetyEquipment[] equipments = {fireExtinguisher1, fireExtinguisher2};

        // Создание объекта системы проверки техники безопасности
        SafetySystemManager safetyCheckSystem = new SafetySystemManager();

        // Выполнение проверки состояния устройств
        safetyCheckSystem.performEquipmentCheck(equipments);
    }
}