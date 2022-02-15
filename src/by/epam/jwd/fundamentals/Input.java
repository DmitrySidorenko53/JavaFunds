package by.epam.jwd.fundamentals;

import java.util.Scanner;

public class Input {
    public int inputInteger() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }

    public double inputDouble() {
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        return number;
    }

    public int[] randomArrayOfInteger(int count) {
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 100) - 50);
        }
        return array;
    }
}
