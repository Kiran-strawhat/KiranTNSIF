package com.Kiran.Assignment4;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentTestScoreTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of test scores: ");  
        
        int n = sc.nextInt();
        
        int[] a = new int[n];
        
        System.out.println("Enter the test scores  ");
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt(); // Fix: use sc instead of G
        }
        
        ArrayList<Integer> scoresList = new ArrayList<>();
        
        for (int score : a) {
            scoresList.add(score);    
        }
        
        System.out.println("Elements in the ArrayList:");
        for (int score : scoresList)  {
            System.out.println(score);
        }
        
        sc.close(); // Fix: close the scanner
    }
}
