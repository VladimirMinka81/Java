package Task_3;

import java.util.Scanner;

public class Town {
    /*
    Пример:
    Милан - ваш ввод в консоль
    Италия - ответ программы
    Дублин - ваш ввод в консоль
    Неизвестная страна - ответ программы
    Stop - ваш ввод в консоль
    *программа завершила работу*
     */
    public static void main(String[] args) {
        System.out.println("Введите название города:");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String country = scanner.nextLine();

            if (country.equals("Stop"))
                break;
            switch (country) {
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Россия");
                    break;
                case "Милан":
                case "Рим":
                case "Турин":
                    System.out.println("Италия");
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кельн":
                    System.out.println("Германия");
                    break;
                default:
                    System.out.println("Неизвестная страна");
            }
        }
    }
}
