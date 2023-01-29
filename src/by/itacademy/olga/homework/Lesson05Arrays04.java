package by.itacademy.olga.homework;

public class Lesson05Arrays04 {
    public static void main (String[] args) {
        int[][] matrix = {
                {-1, 5, 2, -4, 7 },
                {0, -5, 3, -3, -8 },
                {4, -6, 3, -8, 2 }

        };
        int positiveNumbers = 0;
        int negativeNumbers = 0;
        for (int i = 0; i < matrix.length; i++ ) {
            int[] subArray = matrix[i];
            for (int j = 0; j < subArray.length; j++) {
                if (subArray[j] > 0) {
                    positiveNumbers++;
                } else if (subArray[j] < 0) {
                    negativeNumbers++;
                }
            }
        }
        if (positiveNumbers > negativeNumbers) {
            System.out.println("Положительных больше");
        } else {
            System.out.println("Отрицательных больше");
        }




    }
}
