package org.example;

import java.util.Scanner;

public class TimeOfDay {
    public static void run(Scanner scanner) {
        int hour = InputHelper.readInt(scanner, "Введите час (0-23): ", 0, 23);

        String timeOfDay;
        if (hour >= 6 && hour <= 11) {
            timeOfDay = "утро";
        } else if (hour >= 12 && hour <= 17) {
            timeOfDay = "день";
        } else if (hour >= 18 && hour <= 21) {
            timeOfDay = "вечер";
        } else {
            timeOfDay = "ночь";
        }

        System.out.println("Сейчас " + timeOfDay);
    }
}
