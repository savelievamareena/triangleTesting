package org.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Test_103 {
    @RunWith(value = Parameterized.class)
    public static class ScaleneParametrisedTest {
        public int firstNum;
        public int secondNum;
        public int thirdNum;
        public String type;
        public String expectedResult = "SCALENE";

        @Parameterized.Parameters
        public static Collection testData() {
            return Arrays.asList(new Object[][]{
                            {3, 7, 5, "SCALENE"},
                            {4, 2, 3, "SCALENE"},
                            {100, 50, 70, "SCALENE"},
                    }
            );
        }

        public ScaleneParametrisedTest(int firstNum, int secondNum, int thirdNum, String type) {
            this.firstNum = firstNum;
            this.secondNum = secondNum;
            this.thirdNum = thirdNum;
            this.type = type;
        }

        @Test
        public void shouldBeScalene() {
            assertTrue(TriangleChecker.checkTriangle(firstNum, secondNum, thirdNum));
            assertEquals(type, expectedResult);
        }
    }
}
