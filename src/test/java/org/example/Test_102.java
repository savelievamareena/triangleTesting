package org.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Test_102 {
    @RunWith(value = Parameterized.class)
    public static class IsoscelesParametrisedTest {
        public int firstNum;
        public int secondNum;
        public int thirdNum;
        public String type;
        public String expectedResult = "ISOSCELES";

        @Parameterized.Parameters
        public static Collection testData() {
            return Arrays.asList(new Object[][]{
                            {3, 3, 2, "ISOSCELES"},
                            {8, 8, 12, "ISOSCELES"},
                            {500, 200, 500, "ISOSCELES"},
                    }
            );
        }

        public IsoscelesParametrisedTest(int firstNum, int secondNum, int thirdNum, String type) {
            this.firstNum = firstNum;
            this.secondNum = secondNum;
            this.thirdNum = thirdNum;
            this.type = type;
        }

        @Test
        public void shouldBeIsosceles() {
            assertTrue(TriangleChecker.checkTriangle(firstNum, secondNum, thirdNum));
            assertEquals(type, expectedResult);
        }
    }
}
