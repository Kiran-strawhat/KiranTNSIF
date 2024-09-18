package com.Kiran.Assignment;
import java.util.Scanner;
public class circle {
	double radius;
    String colour;

    // Method to accept details of the circle
    void getInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        radius = scanner.nextDouble();

        scanner.nextLine(); // To consume the newline character after double input

        System.out.print("Enter the colour of the circle: ");
        colour = scanner.nextLine();
    }

    // Method to calculate the area of the circle
    void calcArea() {
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
    }
    public static void main(String[] args) {
        // Creating a Circle object
        circle ccircle = new circle();

        // Accepting details and calculating the area
        ccircle.getInput();
        ccircle.calcArea();
    }
}
