package conditional_loops;

import java.util.Scanner;

public class Examples {
    public static void main(String[] args) {
//        occurrence1();
//        occurrence2();
//        reverse();

    }


    public static void occurrence1() {

        Scanner sc = new Scanner(System.in);
        Integer input = sc.nextInt();
        int num = sc.nextInt();

        int occurance = 0;

        String numString = input.toString();
        for (int i = 0; i < numString.length(); i++) {
            if (Integer.parseInt(String.valueOf(numString.charAt(i))) == num) occurance++;
        }

        System.out.println("Occurance of " + num + " is " + occurance);
    }

    public static void occurrence2() {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int num = sc.nextInt();
        int count = 0;

        while (input > 0) {
            int rem = input % 10;
            if (rem == num) count++;
            input = input / 10;
        }
        System.out.println(count);
    }

    public static void reverse() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number to reverse");
        int input = sc.nextInt();

        String data = "";
        while (input > 0) {
            int temp = input % 10;
            data += temp;
            temp = 0;
            input /= 10;
        }
        System.out.println(data);
    }


}
