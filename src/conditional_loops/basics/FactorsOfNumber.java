package conditional_loops.basics;
import java.util.Scanner;

public class FactorsOfNumber {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        factors();
    }

    public static void factors() {
        System.out.println("Enter any number: ");
        int number = sc.nextInt();

        System.out.print("Factors of " + number + " are");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(" " + i);
            }
        }
    }
}
