package org.example;

/**
 * This class provides examples of various methods demonstrating loops and array processing in Java.
 */
public class ExampleUsage {

    /**
     * Filters and counts even numbers in an array of integers from 1 to 20.
     *
     * @return The count of even numbers in the array.
     */
    public int filterAndCountEvenNumbers() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int count = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * Calculates the sum of the main diagonal elements of a square matrix.
     *
     * @return
     */
    public int matrixDiagonalSum() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }

        System.out.println("Sum of Matrix" + sum);
        return sum;
    }

    /**
     * Displays even numbers from an array of integers.
     */
    public void displayEvenNumbers() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // Display even numbers only
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println("Even number: " + number);
            }
        }
    }

    /**
     * Sums an array of integers.
     *
     * @return The sum of the array.
     */
    public int sumArray() {
        int[] numbers = {5, 6, 33, 24, 11};
        int sum = 0; // Correct usage of variable scope
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of array: " + sum);
        return sum;
    }

    /**
     * Processes a 2D matrix and prints each element.
     */
    public void processMatrix() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Iterate over each row and column of the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Element at [" + i + "][" + j + "] is " + matrix[i][j]);
            }
        }
    }
}