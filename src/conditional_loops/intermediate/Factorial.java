package conditional_loops.intermediate;


import java.util.Scanner;

public class Factorial {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        factorial();
    }

    public static void factorial() {
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        int temp = num;
        int factorial = 1;
        while (num != 1) {
            factorial = factorial * num;
            num--;
        }
        System.out.println(temp + "! is " + factorial);
    }
}
