package Task_3;

import java.util.Scanner;

public class DivideNumbers {
    public static void main(String[] args) {
        /*2. Реализовать программу, которая пока работает, принимает на вход от пользователя
        два числа - делимое и делитель. Для этих двух чисел программа рассчитывает
        результат деления и выводит его в консоль. Программа останавливает свою работу
        тогда, когда пользователь вводит 0 в качестве делителя.
        (для этих вещественных чисел необходимо использовать тип double и метод
        nextDouble() у Scanner’а соответственно)
         */
        do {
            System.out.println("Введите делимое: ");
            Scanner scanner = new Scanner(System.in);
            double firstNumber = scanner.nextDouble();

            System.out.println("Введите делить: ");
            Scanner scanner2 = new Scanner(System.in);
            double secondNumber = scanner2.nextDouble();

            double result = firstNumber / secondNumber;

            if (result == 0)
            break;
            System.out.println("результат деления " + result);

        } while (true);
    }
}

