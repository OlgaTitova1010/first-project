package by.itacademy.olga.homework.lesson7;

public class Car {
    CarEnum brand;
    String color;

    public Car(CarEnum brand, String color) {
        this.brand = brand;
        if (brand.correctColor(color)) {
            this.color = color;
        }
    }
    public void changeColor(String color) {
        if (brand.correctColor(color)) {
            this.color = color;
        }
    }
}

enum CarEnum {
    AUDI("Audi", new String[]{"Синий", "Красный", "Зеленый"}),
    BMW("BMW", new String[]{"Оранжевый", "Черный", "Фиолетовый"}),
    KIA("KIA", new String[]{"Желтый", "Cерый", "Белый"});

    private String brand;
    private String[] allowedColors;

    CarEnum(String brand, String[] colors) {
        this.brand = brand;
        this.allowedColors = colors;
    }

    boolean correctColor(String color) {
        for (int i = 0; i < allowedColors.length; i++) {
            if (allowedColors[i] == color) {
                return true;
            }
        }
        return false;
    }
}
