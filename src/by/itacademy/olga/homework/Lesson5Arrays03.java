package by.itacademy.olga.homework;

public class Lesson5Arrays03 {
    public static void main (String[] args) {
        int[] array1 = {1, 50, 6, 10, 22, 50, 8, 12, 30, 42, 50, 55};
        int[] arrayBack = new int[array1.length];
        int arrayBackIndex = 0;
        for (int i = array1.length - 1; i >= 0; i--) {
            arrayBack[arrayBackIndex] = array1[i];
            arrayBackIndex++;

        }
        for (int i = 0; i < arrayBack.length; i++) {

            System.out.println(arrayBack[i]);
        }


    }
}
