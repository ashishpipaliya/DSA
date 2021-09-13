package conditional_loops.intermediate;

import java.util.Scanner;

public class DiscountOfProduct {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        discount();
    }

    public static void discount() {
        System.out.println("Enter price");
        double price = sc.nextDouble();
        System.out.println("Enter % of discount");
        double percentage = sc.nextDouble();

        double disc = (price * percentage) / 100;
        System.out.println("Discount is : " + (disc));
    }

}
