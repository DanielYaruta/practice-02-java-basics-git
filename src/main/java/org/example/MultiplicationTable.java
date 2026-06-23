package org.example;

import java.util.Scanner;

public class MultiplicationTable {
    public static void run(Scanner scanner) {
        int n = InputHelper.readInt(scanner, "Введите число от 1 до 9: ", 1, 9);

        for (int i = 1; i <= 9; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
