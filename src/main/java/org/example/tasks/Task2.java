package org.example.tasks;

import java.util.Scanner;

public class Task2 {
    private static final String VYACHESLAV = "Вячеслав";

    public void task2Algorithm() {
        Scanner scanner = new Scanner(System.in);
        String userInput;
        System.out.println("Задание №2.\nВведите имя: ");
        userInput = scanner.nextLine();
        if (userInput.equals(VYACHESLAV)) {
            System.out.println("Привет, " + VYACHESLAV);
        }
        else {
            System.out.println("Нет такого имени");
        }
    }
}
