package org.example;

/**
 * This class provides examples of loop control in Java.
 */
public class LoopControl {

    /**
     * Calculates the sum of squares of integers from 1 to 10.
     *
     * @return The sum of squares.
     */
    public int sumOfSquares() {
        int index, sum = 0;
        for (index = 1; index <= 10; index++) {
            sum += index*index;
        }
        return sum;
    }

    /**
     * Prints a triangle pattern using asterisks.
     */
    public void printTriangle() {
        int i;
        for (i = 0; i < 5; i++) {
            int j;
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*

    public void incorrectVariableUsage() {
        int index; // VariableDeclarationUsageDistance
        // Some other code
        System.out.println("Preparing to loop...");
        // Loop starts much later after declaration
        index = 0; // VariableDeclarationUsageDistance
        for (; index < 5; index++) {
            System.out.println(index);
        }
    }

    */

    /**
     * Demonstrates correct variable usage within a loop.
     */
    public void correctVariableUsage() {
        System.out.println("Preparing to loop...");
        int index = 0;
        for (; index < 5; index++) {
            System.out.println(index);
        }
    }

    /*

    public void avoidEmptyBlock() {
        for (int j = 0; j < 10; j++) {
            if (j == 5) {
                System.out.println("Midpoint at: " + j);
            } else {

            }
        }
    }

     */

    /**
     * Demonstrates avoiding an empty block inside a loop.
     */
    public void avoidEmptyBlock() {
        for (int j = 0; j < 10; j++) {
            if (j == 5) {
                System.out.println("Midpoint at: " + j);
            } else {
                continue; // fixed emptyBlock
            }
        }
    }

    /*

    public void incorrectControlVariable() {
        for (int m = 0; m < 10; m++) {
            if (m == 5) {
                System.out.println("Adjusting loop index from " + m);
                m += 3; // Incorrect - modifying control variable inside the loop
                System.out.println("to " + m);
            }
        }
    }

    */

    /**
     * Demonstrates correctly modifying a control variable without altering the loop's behavior.
     */
    public void correctlyModifiedControlVariable() {
        for (int m = 0; m < 10; m++) {
            if (m == 5) {
                System.out.println("Adjusting loop index from " + m);
                int adjustedM = m + 3; // Using a separate variable to avoid modifying the control variable
                System.out.println("to " + adjustedM);
            }
        }
    }

    /**
     * Demonstrates incorrect modification of the loop control variable.
     * It modifies the control variable inside the loop, which is generally considered bad practice.
     */
    public void modifyIndexIncorrectly() {
        for (int m = 0; m < 10; m++) {
            if (m == 3) {
                System.out.println("Adjusting loop index from " + m);
                m += 6; // Incorrect - modifying control variable inside the loop
                System.out.println("to " + m);
            }
        }
    }
}
