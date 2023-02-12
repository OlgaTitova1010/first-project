package by.itacademy.olga.homework.lesson7;

import java.util.Arrays;

public class MainCar {

    public static void main(String[] args) {
        Car audy = new Car(CarEnum.AUDI, "Красный");
        audy.changeColor("Фиолетовый");
        System.out.println(audy.color);
        audy.changeColor("Зеленый");
        System.out.println(audy.color);
    }
}
