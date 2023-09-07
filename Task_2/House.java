package Task_2;

import java.util.Scanner;

public class House {
    public static void main(String[] args) {
        //задача про этажи
        System.out.println("Введите кол-во этажей:");
        Scanner scanner = new Scanner(System.in);
        int numberFloat = scanner.nextInt();
        if (numberFloat >= 1 && numberFloat <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (numberFloat >= 5 && numberFloat <= 8) {
            System.out.println("Среднеэтажный дом");
        } else if (numberFloat >= 9) {
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("Ошибка ввода");
        }
    }
}
