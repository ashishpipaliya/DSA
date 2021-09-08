package firstjava;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter number : ");
        int input = sc.nextInt();

        if (input % 2 == 0) {
            System.out.println(input + " is Even");
        } else {
            System.out.println(input + " is Odd");
        }
    }
}
