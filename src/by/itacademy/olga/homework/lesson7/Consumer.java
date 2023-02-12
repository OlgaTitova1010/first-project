package by.itacademy.olga.homework.lesson7;

public class Consumer {
    int a = 0;
    int[] array = new int[5];

    public Consumer() {

    }

    public void consume(int number) {
        if (a == 5) {
            a = 0;
        }
        array[a] = number;
        a++;


    }

    public int avg() {
        int sum = 0;
        int positiveCount = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (array[i] > 0) {
                positiveCount++;
            }
        }
        return sum / positiveCount;

    }
}
