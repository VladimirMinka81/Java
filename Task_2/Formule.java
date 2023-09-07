package Task_2;

import java.util.Scanner;

public class Formule {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //формула
        System.out.println();
        System.out.println("введите число Х ");
        double x = scanner.nextDouble();
        double y = (Math.pow(x, 2) - 10) / (x + 7);
        System.out.println(y);
    }
}
