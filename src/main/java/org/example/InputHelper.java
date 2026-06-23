package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputHelper {
    public static int readInt(Scanner scanner, String prompt, int min, int max) {
        while (true) {
            System.out.print(prompt);
            try {
                int value = scanner.nextInt();
                if (value < min || value > max) {
                    System.out.println("Ошибка: введите число от " + min + " до " + max + ".");
                } else {
                    return value;
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: введите целое число.");
                scanner.nextLine();
            }
        }
    }
}
