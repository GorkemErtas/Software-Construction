package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.example.ExampleUsage;
import org.example.LoopControl;


import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for App.
 */
public class AppTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        LoopControl loopControl = new LoopControl();
        ExampleUsage exampleUsage = new ExampleUsage();

        loopControl.sumOfSquares();
        exampleUsage.filterAndCountEvenNumbers();
        loopControl.printTriangle();
        loopControl.modifyIndexIncorrectly();
        loopControl.modifyIndexIncorrectly();
        int sum = exampleUsage.matrixDiagonalSum();
        assertEquals(30, sum);
        exampleUsage.processMatrix();
    }
}

