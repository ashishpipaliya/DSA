package firstjava;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.println("Please enter two numbers : ");

        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();

        System.out.println("what operation you want to perform : \n1.Sum\n2.Subtract\n3.Multiply\n4.Division");
        double operationType = sc.nextInt();

        if (operationType == 1) {
            System.out.println("Sum is " + (n1 + n2));
        } else if (operationType == 2) {
            System.out.println("Subtraction is " + (n1 - n2));
        } else if (operationType == 3) {
            System.out.println("Multiplication is " + (n1 * n2));
        } else if (operationType == 4) {
            System.out.println("Division is " + (n1 / n2));
        } else {
            System.out.println("Something is not right!");
        }
        System.out.println();
    }
}
