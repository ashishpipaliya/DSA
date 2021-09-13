package conditional_loops.intermediate;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        distance();
    }

    public static void distance() {
        System.out.println("Enter co-ordinates of point 1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.println("Enter co-ordinates of point 2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double dist = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("Distance is : " + (dist));
    }
}
