package org.example;
import java.io.*;
import java.util.Objects;


/**
 * Hello world!
 *
 */
public class App {
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

            TriangleChecker.checkTriangle(firstNum, secondNum, thirdNum);

            System.out.println("One more time? Y/N: ");
        }while(Objects.equals(br.readLine().toUpperCase(), "Y"));
    }
}
