package prakt4;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Введите число N: ");
        int N = scanner.nextInt();


        int[] numbers = new int[N];


        for (int i = 0; i < N; i++) {
            numbers[i] = i + 1;
        }


        System.out.print("Массив: ");
        for (int i = 0; i < N; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();


        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += numbers[i];
        }


        double average = (double) sum / N;
        System.out.println("Среднее значение: " + average);


        long product = 1;
        boolean found = false;

        for (int i = 0; i < N; i++) {
            if (numbers[i] > average) {
                product *= numbers[i];
                found = true;
                System.out.println("Элемент " + numbers[i] + " больше среднего");
            }
        }


        if (found) {
            System.out.println("Произведение элементов, больших среднего: " + product);
        } else {
            System.out.println("Нет элементов, больших среднего значения");
        }


        scanner.close();
    }
}