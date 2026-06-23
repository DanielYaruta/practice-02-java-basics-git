package org.example;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void run(Scanner scanner) {
        Random random = new Random();
        int secret = random.nextInt(100) + 1;
        int attempts = 0;

        System.out.println("Я загадал число от 1 до 100. Попробуй угадать!");

        while (true) {
            int guess = InputHelper.readInt(scanner, "Твоя попытка: ", 1, 100);
            attempts++;

            if (guess < secret) {
                System.out.println("Больше!");
            } else if (guess > secret) {
                System.out.println("Меньше!");
            } else {
                System.out.println("Правильно! Ты угадал за " + attempts + " попыток(ки).");
                break;
            }
        }
    }
}
