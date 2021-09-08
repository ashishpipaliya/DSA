package firstjava;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter Principal(P) : ");
        double p = sc.nextDouble();

        System.out.print("Please enter Time (T) : ");
        double t = sc.nextDouble();

        System.out.print("Please enter Rate (R) : ");
        double r = sc.nextDouble();

        double interest = p * r * t * 0.01;
        System.out.println(interest);

    }
}
