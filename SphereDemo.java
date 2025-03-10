package SphereDemo;

import java.util.Scanner;

public class SphereDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Sphere s0 = new Sphere(0);
        Sphere s2 = new Sphere(2);
        Sphere s3 = new Sphere(3);

        // Prompt the user to enter the radius three times for each ID
        
        System.out.print("Enter the radius for s0: ");
        s0.setRadius(scanner.nextDouble());

        System.out.print("Enter the radius for s2: ");
        s2.setRadius(scanner.nextDouble());

        System.out.print("Enter the radius for s3: ");
        s3.setRadius(scanner.nextDouble());

        // Print the output of the calculations made, and call back to getVolume and getArea
        
        System.out.println(s0.toString());
        System.out.println("Volume of s0: " + s0.getVolume());
        System.out.println("Area of s0: " + s0.getArea());

        System.out.println(s2.toString());
        System.out.println("Volume of s2: " + s2.getVolume());
        System.out.println("Area of s2: " + s2.getArea());

        System.out.println(s3.toString());
        System.out.println("Volume of s3: " + s3.getVolume());
        System.out.println("Area of s3: " + s3.getArea());

    }
}
