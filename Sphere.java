package SphereDemo;

import java.util.Scanner;

class Sphere { // Create Sphere class
    private int id;
    private double radius;

    public Sphere(int sphereId) {
        id = sphereId; // Use a different name for the parameter
    }

    public double getRadius() { // For calling the radius
        return radius;
    }

    public void setRadius(double newRadius) {
        if (newRadius > 0) {
            radius = newRadius; // Use a different name for the parameter
        } else {
            System.out.println("Invalid radius. Please enter a positive value."); // Error message
        }
    }

    public double getVolume() { // Calculates the volume of the shape
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public double getArea() { // Calculate the surface area of the shape
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    
    public String toString() { // generating an appropriate string to provide ID and radius of the instance
        return "\nSphere ID: " + id + ", Radius: " + radius;
    }
}