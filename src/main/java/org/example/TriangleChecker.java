package org.example;

public class TriangleChecker {
    public static boolean isTriangle = false;
    public static String triangleType = "SCALENE";
    public static boolean checkTriangle(int firstNum, int secondNum, int thirdNum) {
        if (firstNum != 0 && secondNum != 0 && thirdNum != 0) {
            if(firstNum + secondNum > thirdNum && firstNum + thirdNum > secondNum && secondNum + thirdNum > firstNum) {
                isTriangle = true;
                System.out.println("Yep, it's a triangle!");
                if(firstNum == secondNum && secondNum == thirdNum) {
                    triangleType = "EQUILATERAL";
                    System.out.println("It is an EQUILATERAL triangle");
                } else if (firstNum == secondNum || secondNum == thirdNum || firstNum == thirdNum) {
                    triangleType = "ISOSCELES";
                    System.out.println("It is an ISOSCELES triangle");
                }else {
                    System.out.println("It is a SCALENE triangle");
                }
            }
        }

        if(!isTriangle) {
            System.out.println("Not a triangle");
        }

        return isTriangle;
    }
}
