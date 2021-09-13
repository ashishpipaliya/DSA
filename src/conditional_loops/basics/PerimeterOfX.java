package conditional_loops.basics;

import java.util.Scanner;

public class PerimeterOfX {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        perimeterOfCircle();
//        perimeterOfEquilateralTriangle();
//        perimeterOfParallelogram();
//        perimeterOfRectangle();
//        perimeterOfSquare();
        perimeterOfRhombus();
    }


    public static void perimeterOfCircle() {
        System.out.print("Enter radius of circle r: ");
        double r = sc.nextDouble();
        double perimeter = 2 * Math.PI * r;
        System.out.println("Perimeter of circle as per 2πr is : " + perimeter);
    }

    public static void perimeterOfEquilateralTriangle() {
        System.out.print("Enter side of triangle a : ");
        double a = sc.nextDouble();
        double perimeter = 3 * a;
        System.out.println("Perimeter of Equilateral Triangle as per 3*a is : " + perimeter);
    }


    public static void perimeterOfParallelogram() {
        System.out.print("Enter side of Parallelogram a : ");
        double a = sc.nextDouble();
        System.out.print("Enter base of Parallelogram b : ");
        double b = sc.nextDouble();
        double perimeter = 2 * (a + b);
        System.out.println("Perimeter of Parallelogram as per 2(a+b) is : " + perimeter);
    }

    public static void perimeterOfRectangle() {
        System.out.print("Enter length of Rectangle l : ");
        double l = sc.nextDouble();
        System.out.print("Enter width of Rectangle w : ");
        double w = sc.nextDouble();
        double perimeter = 2 * (l + w);
        System.out.println("Perimeter of Rectangle as per 2(l+w) is : " + perimeter);
    }


    public static void perimeterOfSquare() {
        System.out.print("Enter side of Square a : ");
        double a = sc.nextDouble();
        double perimeter = 4 * a;
        System.out.println("Perimeter of Square as per 4a is : " + perimeter);
    }


    public static void perimeterOfRhombus() {
        System.out.print("Enter side of Rhombus a : ");
        double a = sc.nextDouble();
        double perimeter = 4 * a;
        System.out.println("Perimeter of Rhombus as per 4a is : " + perimeter);
    }
}
