package by.epam.jwd.fundamentals;

public class Printer {
    public void printDouble(double realNumber) {
        System.out.println(realNumber);
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printBoolean(boolean bool) {
        System.out.println(bool);
    }
}
