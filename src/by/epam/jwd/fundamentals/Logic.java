package by.epam.jwd.fundamentals;

public class Logic {
    public boolean compareSumOfDigits(int a) {
        return ((a / 1000) + (a / 100 % 10) == (a % 100 / 10) + (a % 10));
    }

    public double calculatePerimeterOfTriangle(double a, double b) {
        if (a > 0 && b > 0) {
            double perimeter = a + b + Math.sqrt(a * a + b * b);
            return perimeter;
        } else {
            return 0;
        }
    }

    public double calculateSquareOfTriangle(double a, double b) {
        if (a > 0 && b > 0) {
            double square = a * b / 2;
            return square;
        } else {
            return 0;
        }
    }

    public int[] numsSquare(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                nums[i] = (int) Math.pow(nums[i], 2);
            } else if (nums[i] < 0) {
                nums[i] = (int) Math.pow(nums[i], 4);
            }
        }
        return nums;
    }

    public double calculateNumbersSum(double a, double b, double c) {
        return Math.max(Math.max(a, b), c) + Math.min(Math.min(a, b), c);
    }

    public double elemSum(int[] A, int K) {
        double sum = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % K == 0) {
                sum += A[i];
            }
        }
        return sum;
    }

    public int[][] fillTheMatrix(int n) {
        int[][] matrix = new int[n][n];
        if (n % 2 == 0) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (i % 2 != 0) {
                        matrix[i][j] = n - j;
                    } else {
                        matrix[i][j] = j + 1;
                    }
                }
            }
        }
        return matrix;
    }
}
