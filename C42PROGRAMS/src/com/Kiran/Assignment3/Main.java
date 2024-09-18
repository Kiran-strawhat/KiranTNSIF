package com.Kiran.Assignment3;
import java.util.Scanner;

interface Airfare {
 Double calculateAmount();
}

class AirIndia implements Airfare {
 private Integer hours;
 private Double costPerHour;

 public AirIndia() {
     this.hours = 0;
     this.costPerHour = 0.0;
 }

 public AirIndia(Integer hours, Double costPerHour) {
     this.hours = hours;
     this.costPerHour = costPerHour;
 }

 public Integer getHours() {
     return hours;
 }

 public void setHours(Integer hours) {
     this.hours = hours;
 }

 public Double getCostPerHour() {
     return costPerHour;
 }

 public void setCostPerHour(Double costPerHour) {
     this.costPerHour = costPerHour;
 }

 @Override
 public Double calculateAmount() {
     return hours * costPerHour;
 }
}

class KingFisher implements Airfare {
 private Integer hours;
 private Double costPerHour;

 public KingFisher() {
     this.hours = 0;
     this.costPerHour = 0.0;
 }

 public KingFisher(Integer hours, Double costPerHour) {
     this.hours = hours;
     this.costPerHour = costPerHour;
 }

 public Integer getHours() {
     return hours;
 }

 public void setHours(Integer hours) {
     this.hours = hours;
 }

 public Double getCostPerHour() {
     return costPerHour;
 }

 public void setCostPerHour(Double costPerHour) {
     this.costPerHour = costPerHour;
 }

 @Override
 public Double calculateAmount() {
     return hours * costPerHour * 4;
 }
}

class Indigo implements Airfare {
 private Integer hours;
 private Double costPerHour;

 public Indigo() {
     this.hours = 0;
     this.costPerHour = 0.0;
 }

 public Indigo(Integer hours, Double costPerHour) {
     this.hours = hours;
     this.costPerHour = costPerHour;
 }

 public Integer getHours() {
     return hours;
 }

 public void setHours(Integer hours) {
     this.hours = hours;
 }

 public Double getCostPerHour() {
     return costPerHour;
 }

 public void setCostPerHour(Double costPerHour) {
     this.costPerHour = costPerHour;
 }

 @Override
 public Double calculateAmount() {
     return hours * costPerHour * 8;
 }
}

public class Main {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Select the option(1,2,3) : ");
     int choice = scanner.nextInt();
     if(choice!=1 && choice!=2 && choice!=3) {
    	 System.out.println("Invalid choice");
     }
     else {
    	 System.out.print("Enter the hours you were going to travel : ");
         int hours = scanner.nextInt();
         System.out.print("Enter the costper hour : ");
         double costPerHour = scanner.nextDouble();
         Airfare airfare = null;

         switch (choice) {
             case 1:
                 airfare = new AirIndia(hours, costPerHour);
                 break;
             case 2:
                 airfare = new KingFisher(hours, costPerHour);
                 break;
             case 3:
                 airfare = new Indigo(hours, costPerHour);
                 break;
             default:
                 System.out.println("Invalid choice");
                 System.exit(1);
         }
         
         double amount = airfare.calculateAmount();
         System.out.printf("%.2f%n", amount);    
         scanner.close();
     }
 }
}

