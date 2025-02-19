package JAVAOOP.lab_09;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side 1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter side 2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter side 3: ");
        double side3 = scanner.nextDouble();

        try {
            Triangle t = new Triangle(side1, side2, side3);
            System.out.println("Perimeter for t: " + t.getPerimeter());
            System.out.println("Area for t: " + t.getArea());
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Side1: " + side1);
        System.out.println("Side2: " + side2);
        System.out.println("Side3: " + side3);

        scanner.close();
    }
}
