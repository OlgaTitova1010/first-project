package by.itacademy.olga.homework.lesson7;

import java.util.Arrays;

public class Lesson07ConsumerMain {
    public static void main(String[] args) {
        Consumer consumer = new Consumer();
        consumer.consume(3);
        consumer.consume(1);
        consumer.consume(1);
        consumer.consume(1);
        consumer.consume(1);
        consumer.consume(1);
        int avg = consumer.avg();
        System.out.println(avg);
    }

}
