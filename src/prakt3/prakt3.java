package prakt3;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Задача 4: Минимум из двух");
        System.out.print("Введите два числа: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();


        int min = (a < b) ? a : b;
        System.out.println("Минимальное число: " + min);
        System.out.println();


        System.out.println("Задача 15: Месяц → сезон");
        System.out.print("Введите номер месяца (1-12): ");
        int month = scanner.nextInt();
        String season;

        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "Весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "autumn";
                break;
            default:
                season = "Некоректно";
        }

        System.out.println("Сезон: " + season);
        System.out.println();


        System.out.println("Задача 20: Треугольник по сторонам");
        System.out.print("Введите три стороны треугольника: ");
        double sideA = scanner.nextDouble();
        double sideB = scanner.nextDouble();
        double sideC = scanner.nextDouble();


        if (sideA > 0 && sideB > 0 && sideC > 0) {
            if (sideA + sideB > sideC &&
                    sideA + sideC > sideB &&
                    sideB + sideC > sideA) {
                System.out.println("Да");
            } else {
                System.out.println("Нет");
            }
        } else {
            System.out.println("Нет");
        }

        scanner.close();
    }
}