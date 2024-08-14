package MethodAssignment;

import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The first "+"natural number is ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(i*i+" ");
        }
    }
}
// Ques.1 Write a method to print squares of the first n natural numbers, taking n as argument to the method.
