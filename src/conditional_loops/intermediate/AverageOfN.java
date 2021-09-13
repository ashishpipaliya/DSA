package conditional_loops.intermediate;

import java.util.Scanner;

public class AverageOfN {
   static Scanner sc =new Scanner(System.in);
    public static void main(String[] args) {
//        average();
        sum();
    }

    public static void average() {
        int sum = 0;
        int count =0;
        System.out.println("Enter numbers and press 0 (ZERO) at last to stop input");
        while (true) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            } else {
                sum += num;
                count++;
            }
        }
        System.out.println("Average is : " + (sum /count));
    }


    public static void sum() {
        int sum = 0;
        System.out.println("Enter numbers and press 0 (ZERO) at last to stop input");
        while (true) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            } else {
                sum += num;
            }
        }
        System.out.println("Sum is : " + sum);
    }
}
