package conditional_loops.basics;

import java.util.Scanner;

public class VolumeOfX {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        volumeOfCone();
//        volumeOfPrism();
//        volumeOfCylinder();
//        volumeOfSphere();
        volumeOfPyramid();
    }


    public static void volumeOfCone() {
        System.out.print("Enter radius r: ");
        double r = sc.nextDouble();
        System.out.print("Enter height h: ");
        double h = sc.nextDouble();

        double volume = Math.PI * Math.pow(r, 2) * (h / 3);
        System.out.println("volume of Cone is : " + volume);
    }


    public static void volumeOfPrism() {
        System.out.print("Enter length l: ");
        double l = sc.nextDouble();
        System.out.print("Enter width w: ");
        double w = sc.nextDouble();
        System.out.print("Enter height h: ");
        double h = sc.nextDouble();

        double volume = l * w * h;
        System.out.println("volume of Prism is : " + volume);
    }

    public static void volumeOfCylinder() {
        System.out.print("Enter radius r: ");
        double r = sc.nextDouble();
        System.out.print("Enter height h: ");
        double h = sc.nextDouble();

        double volume = Math.PI * Math.pow(r, 2) * h;
        System.out.println("volume of Cylinder is : " + volume);
    }

    public static void volumeOfSphere() {
        System.out.print("Enter radius r: ");
        double r = sc.nextDouble();

        double volume = 1.33 * Math.PI * Math.pow(r, 3);
        System.out.println("volume of Sphere is : " + volume);
    }

    public static void volumeOfPyramid() {
        System.out.print("Enter length l: ");
        double l = sc.nextDouble();
        System.out.print("Enter width w: ");
        double w = sc.nextDouble();
        System.out.print("Enter height h: ");
        double h = sc.nextDouble();

        double volume = (l * w * h) / 3;
        System.out.println("volume of Pyramid is : " + volume);
    }


}
