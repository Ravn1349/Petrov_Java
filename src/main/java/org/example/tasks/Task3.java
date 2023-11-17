package org.example.tasks;

import java.util.Scanner;

public class Task3 {

    private static final Integer THREE = 3;

    public void task3Algorithm() {
        Scanner scanner = new Scanner(System.in);
        String userInput;
        System.out.println("Задание №3.\nВведите массив целых чисел через пробел: ");
        userInput = scanner.nextLine();
        String[] stringArray = userInput.split(" ");

        int[] intArray = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }

        for (int item : intArray) {
            if (item % THREE == 0) {
                System.out.println("элементы массива кратные 3: " + item);
            }
        }
    }
}
