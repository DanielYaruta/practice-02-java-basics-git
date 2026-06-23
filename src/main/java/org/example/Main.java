package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Меню ===");
            System.out.println("1. Определение времени суток");
            System.out.println("2. Таблица умножения");
            System.out.println("3. Игра «Угадай число»");
            System.out.println("0. Выход");

            int choice = InputHelper.readInt(scanner, "Выберите пункт: ", 0, 3);

            switch (choice) {
                case 1 -> TimeOfDay.run(scanner);
                case 2 -> MultiplicationTable.run(scanner);
                case 3 -> GuessNumber.run(scanner);
                case 0 -> {
                    System.out.println("До свидания!");
                    return;
                }
            }
        }
    }
}
