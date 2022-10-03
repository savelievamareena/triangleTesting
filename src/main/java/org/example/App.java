package org.example;
import java.io.*;
import java.util.Objects;


/**
 * Hello world!
 *
 */
public class App {
    public static Answer checkTriangle(int firstNum, int secondNum, int thirdNum) {
        Answer answer = new Answer();

        if (firstNum != 0 && secondNum != 0 && thirdNum != 0) {
            if(firstNum + secondNum > thirdNum && firstNum + thirdNum > secondNum && secondNum + thirdNum > firstNum) {
                answer.isTriangle = true;
                System.out.println("Yep, it's a triangle!");
                if(firstNum == secondNum && secondNum == thirdNum) {
                    answer.triangleType = "EQUILATERAL";
                    System.out.println("It is an EQUILATERAL triangle");
                } else if (firstNum == secondNum || secondNum == thirdNum || firstNum == thirdNum) {
                    answer.triangleType = "ISOSCELES";
                    System.out.println("It is an ISOSCELES triangle");
                }else {
                    System.out.println("It is a SCALENE triangle");
                }
            }
        }

        if(!answer.isTriangle) {
            System.out.println("Not a triangle");
        }

        return answer;
    }

    public static void main( String[] args ) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int firstNum, secondNum, thirdNum;

        do{
            System.out.println("Введите длину первой стороны: ");
            firstNum = Integer.parseInt(br.readLine());
            System.out.println("Введите длину второй стороны: ");
            secondNum = Integer.parseInt(br.readLine());
            System.out.println("Введите длину первой стороны: ");
            thirdNum = Integer.parseInt(br.readLine());

            checkTriangle(firstNum, secondNum, thirdNum);

            System.out.println("One more time? Y/N: ");
        }while(Objects.equals(br.readLine().toUpperCase(), "Y"));
    }
}
