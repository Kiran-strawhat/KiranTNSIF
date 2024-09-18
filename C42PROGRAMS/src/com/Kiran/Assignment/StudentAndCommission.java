package com.Kiran.Assignment;
import java.util.Scanner;

class Student {
    // Default Constructor
    Student() {
        System.out.println("Student object is created");
    }
}

class Commission {
    // Data Members
    String name;
    String address;
    String phone;
    double salesAmount;

    // Method to accept details of the sales employee
    void acceptDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = scanner.nextLine();

        System.out.print("Enter Address: ");
        address = scanner.nextLine();

        System.out.print("Enter Phone Number: ");
        phone = scanner.nextLine();

        System.out.print("Enter Sales Amount: ");
        salesAmount = scanner.nextDouble();
    }

    // Method to calculate the commission
    void calculateCommission() {
        double commission = 0;
        if (salesAmount >= 100000) {
            commission = 0.10 * salesAmount;
        } else if (salesAmount >= 50000) {
            commission = 0.05 * salesAmount;
        } else if (salesAmount >= 30000) {
            commission = 0.03 * salesAmount;
        } else {
            commission = 0;
        }

        System.out.println("Commission earned: $" + commission);
    }
}
public class StudentAndCommission {
	 public static void main(String[] args) {
	        // Creating a Student object
	        Student student = new Student();

	        // Creating a Commission object and accepting details
	        Commission commission = new Commission();
	        commission.acceptDetails();
	        commission.calculateCommission();
	    }
}
