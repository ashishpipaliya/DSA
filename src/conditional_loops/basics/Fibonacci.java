package conditional_loops.basics;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        fibonacci();
    }


    public static void fibonacci() {
        int a = 0, b = 1, c;

        System.out.println("Enter input");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.print(a + " " + b);
        for (int i = 2; i <= input; i++) {
            c = a + b;
            a = b;
            b = c;

            System.out.print(" " + c);
        }
    }
}
