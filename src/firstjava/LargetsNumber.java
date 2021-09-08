package firstjava;

import java.util.Scanner;

public class LargetsNumber {
    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        if (n1 != n2) {
            if (n1 > n2) {
                System.out.println("Largest number is " + n1);
            } else {
                System.out.println("Largest number is " + n2);
            }
        } else {
            System.out.println("Please enter two different numbers");
        }
    }
}
