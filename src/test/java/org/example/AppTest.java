package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldBeEquilateral()
    {
        Answer result1 = App.checkTriangle(3, 3, 3);
        assertTrue(result1.isTriangle);
        assertEquals(result1.triangleType, "EQUILATERAL");

        Answer result2 = App.checkTriangle(10, 10, 10);
        assertTrue(result2.isTriangle);
        assertEquals(result2.triangleType, "EQUILATERAL");

        Answer result3 = App.checkTriangle(999, 999, 999);
        assertTrue(result3.isTriangle);
        assertEquals(result3.triangleType, "EQUILATERAL");
    }

    @Test
    public void shouldBeIsosceles()
    {
        Answer result1 = App.checkTriangle(3, 3, 2);
        assertTrue(result1.isTriangle);
        assertEquals(result1.triangleType, "ISOSCELES");

        Answer result2 = App.checkTriangle(8, 8, 12);
        assertTrue(result2.isTriangle);
        assertEquals(result2.triangleType, "ISOSCELES");

        Answer result3 = App.checkTriangle(500, 200, 500);
        assertTrue(result3.isTriangle);
        assertEquals(result3.triangleType, "ISOSCELES");
    }

    @Test
    public void shouldBeScalene() {
        Answer result1 = App.checkTriangle(3, 7, 5);
        assertTrue(result1.isTriangle);
        assertEquals(result1.triangleType, "SCALENE");

        Answer result2 = App.checkTriangle(4, 2, 3);
        assertTrue(result2.isTriangle);
        assertEquals(result2.triangleType, "SCALENE");

        Answer result3 = App.checkTriangle(100, 50, 70);
        assertTrue(result3.isTriangle);
        assertEquals(result3.triangleType, "SCALENE");
    }
}
