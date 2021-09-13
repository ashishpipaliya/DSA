package conditional_loops.basics;


import java.util.Scanner;

public class AreaOfX {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        areaOfCircle();
//        areaOfTriangle();
//        areaOfRectangle();
//        areaOfIsoscelesTriangle();
//        areaOfParallelogram();
//        areaOfRhombus();
        areaOfEquilateralTriangle();
    }

    public static void areaOfCircle() {
        System.out.println("Enter radius of circle");
        double r = sc.nextDouble();
        double area = Math.PI * Math.pow(r, 2);
        System.out.println(area);
        sc.reset();
    }

    public static void areaOfTriangle() {
        System.out.print("Enter base size ");
        double base = sc.nextDouble();
        System.out.print("Enter height ");
        double height = sc.nextDouble();
        double area = 0.5 * base * height;
        System.out.println(area);
        sc.reset();
    }

    public static void areaOfRectangle() {
        System.out.print("Enter length of size ");
        double l = sc.nextDouble();
        System.out.print("Enter width ");
        double w = sc.nextDouble();
        double area = l * w;
        System.out.println(area);
    }

    public static void areaOfIsoscelesTriangle() {
        System.out.print("Enter base size ");
        double base = sc.nextDouble();
        System.out.print("Enter height ");
        double height = sc.nextDouble();
        double area = 0.5 * base * height;
        System.out.println(area);
        sc.reset();
    }

    public static void areaOfParallelogram() {
        System.out.print("Enter base size ");
        double base = sc.nextDouble();
        System.out.print("Enter height ");
        double height = sc.nextDouble();
        double area = base * height;
        System.out.println(area);
        sc.reset();
    }

    public static void areaOfRhombus() {
        System.out.print("Enter diagonal 1 d1: ");
        double d1 = sc.nextDouble();
        System.out.print("Enter diagonal 2 d2: ");
        double d2 = sc.nextDouble();
        double area = (d1 * d2) / 2;
        System.out.println("area as per (d1 * d2) / 2 is " + area);
        sc.reset();
    }

    public static void areaOfEquilateralTriangle() {
        System.out.print("Enter side a: ");
        double a = sc.nextDouble();
        double area = (Math.sqrt(3) / 4) * Math.pow(a, 2);
        System.out.println("area of Equilateral Triangle as per (√3/4)a^2 is " + area);
    }

}
