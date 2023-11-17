package org.example.tasks;

import java.util.Scanner;

public class Task1 {
    private static final int SEVEN = 7;

    public void task1Algorithm() {
        Scanner scanner = new Scanner(System.in);
        int userInput;
        System.out.println("Задание №1.\nВведите целое число: ");
        userInput = scanner.nextInt();
        if (userInput > 7) {
            System.out.println("Привет");
        }
    }
}
