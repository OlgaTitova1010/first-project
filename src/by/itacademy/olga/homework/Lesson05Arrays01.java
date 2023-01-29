package by.itacademy.olga.homework;

public class Lesson05Arrays01 {

    public static void main (String[] args) {
      int[] array = {1, 50, 6, 10, 22, 50, 8, 12, 30, 42, 50, 55};
      int n = 50;
      int sum = 0;
      for (int i = 0; i < array.length; i++ ) {

          if (array[i] != n) {
              sum = sum + array[i];
          }

      }
      System.out.println(sum);

    }
}
