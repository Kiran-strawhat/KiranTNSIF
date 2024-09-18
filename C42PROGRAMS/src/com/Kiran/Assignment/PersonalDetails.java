package com.Kiran.Assignment;
import java.util.Scanner;
public class PersonalDetails {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name with initial: ");
        String fullName = scanner.nextLine();

        System.out.print("Enter your roll number: ");
        String rollNumber = scanner.nextLine();

        System.out.print("Enter your grade: ");
        char grade = scanner.next().charAt(0);

        System.out.print("Enter your percentage: ");
        String percentage = scanner.next();

        System.out.println("\n" + fullName);
        System.out.println(rollNumber);
        System.out.println("\t" + grade);
        System.out.println("\t" + percentage);
    }

}
