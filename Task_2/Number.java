package Task_2;

import java.util.Scanner;

public class Number {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //задача про разницу чисел
        System.out.println();
        System.out.println("введите число a:  ");
        int a = scanner.nextInt();
        System.out.println("введите число b:  ");
        int b = scanner.nextInt();
        System.out.println();
        for (int i = a; i <= b; i++) {
            if (i % 5 == 0 && i % 10 != 0) {
                System.out.println(i);
            }
        }
    }
}
