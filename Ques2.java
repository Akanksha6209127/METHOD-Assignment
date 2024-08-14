package MethodAssignment;

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        double a = 3.14*r*r;
        System.out.println("The area of a circle is "+ a+ " ");
    }
}
// Ques.2 Write a method that takes the radius of a circle as can argument and return its area.