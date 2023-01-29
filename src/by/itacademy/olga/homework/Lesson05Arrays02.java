package by.itacademy.olga.homework;

public class Lesson05Arrays02 {
    public static void main (String[] args) {
        int fibo[] = {0, 1, 1, 2, 3, 5, 8, 13, 21};
        int n1 = 7;
        int sum1 = 0;
        for (int a = 0; a < fibo.length; a++ ) {

            if (fibo[a] % 2 ==0 ) {
                sum1 = sum1 + fibo[a];
            }
        }
        System.out.println(sum1);




    }
}
