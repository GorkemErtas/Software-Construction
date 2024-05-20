import org.example.ExampleUsage;
import org.example.LoopControl;

/**
 * App class to demonstrate the functionality of LoopControl and ExampleUsage classes.
 * This class contains a main method that showcases various methods from LoopControl
 * and ExampleUsage classes, illustrating different coding practices and their outcomes.
 */
public class App {
    /**
     * The main method is the entry point of the application.
     * It demonstrates the usage of methods from LoopControl and ExampleUsage classes.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        final LoopControl loopControl = new LoopControl();
        final ExampleUsage exampleUsage = new ExampleUsage();

        System.out.println("Demonstrating correct variable usage:");
        loopControl.sumOfSquares();

        System.out.println("\nDemonstrating incorrect variable usage:");
        exampleUsage.filterAndCountEvenNumbers();

        System.out.println("\nDemonstrating empty block usage (should handle without output):");
        loopControl.printTriangle();

        System.out.println("\nDemonstrating correctly modified control variable:");
        loopControl.modifyIndexIncorrectly();

        System.out.println("\nDemonstrating incorrectly modified control variable:");
        loopControl.modifyIndexIncorrectly();

        System.out.println("\nSumming an array:");
        int sum = exampleUsage.matrixDiagonalSum();
        System.out.println("Total Sum: " + sum);

        System.out.println("\nProcessing a matrix:");
        exampleUsage.processMatrix();
    }
}

