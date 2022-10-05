package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Unit test for simple App.
 */
public class Test_101 {
    @RunWith(value = Parameterized.class)
    public static class EquilateralParametrisedTest {
        public int firstNum;
        public int secondNum;
        public int thirdNum;
        public String type;
        public String expectedResult = "EQUILATERAL";

        @Parameterized.Parameters
        public static Collection testData() {
            return Arrays.asList(new Object[][]{
                            {3, 3, 3, "EQUILATERAL"},
                            {10, 10, 10, "EQUILATERAL"},
                            {999, 999, 999, "EQUILATERAL"},
                    }
            );
        }

        public EquilateralParametrisedTest(int firstNum, int secondNum, int thirdNum, String type) {
            this.firstNum = firstNum;
            this.secondNum = secondNum;
            this.thirdNum = thirdNum;
            this.type = type;
        }

        @Test
        public void shouldBeEquilateral() {
            assertTrue(TriangleChecker.checkTriangle(firstNum, secondNum, thirdNum));
            assertEquals(type, expectedResult);
        }
    }
}