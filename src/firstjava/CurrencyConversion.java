package firstjava;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter currency in ₹\n");

        //Assuming dollar rate  73.56 as on 08/09/2021
        double rupee = sc.nextDouble();
        double dollar = rupee / 73.56;
        System.out.println(rupee + "₹ is equal to $" + dollar);
    }
}
