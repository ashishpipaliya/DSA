package conditional_loops.basics;

import java.util.Scanner;

public class SurfaceAreaOfX {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        curvedSurfaceAreaOfCylinder();
        totalSurfaceAreaOfCube();
    }


    public static void curvedSurfaceAreaOfCylinder() {
        System.out.print("Enter radius r: ");
        double r = sc.nextDouble();
        System.out.print("Enter height h: ");
        double h = sc.nextDouble();

        double area = 2 * Math.PI * r * h;
        System.out.println(area);
    }

    public static void totalSurfaceAreaOfCube() {
        System.out.print("Enter side a: ");
        double a = sc.nextDouble();

        double area = 6 * Math.pow(a, 2);
        System.out.println(area);
    }
}
