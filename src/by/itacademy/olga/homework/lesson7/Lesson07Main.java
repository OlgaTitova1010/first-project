package by.itacademy.olga.homework.lesson7;

public class Lesson07Main {
    public static void main(String[] args) {
        for (Month mon: Month.values()) {
            System.out.println("Current month name is " + mon.getNameByNumber(mon.getNumber()));
            System.out.println("Current month number is " + mon.getNumberByName(mon.name()));
            System.out.println("Current month number is " + mon.getNumberByName(mon.name()));
        }

    }

}
