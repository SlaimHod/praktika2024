package model.instruction;

public class Person {
//todo нужно убрать возраст, добавить id базы данных(первичный ключ) и id табельного номера (о ком конкретно идет речь)
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
