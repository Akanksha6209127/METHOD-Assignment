package MethodAssignment;

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        for(int i=a+1;i<=b-1;i++){
           if(i%2!=0)
               System.out.print(i+" ");
        }
    }
}
// Ques.3 Give two numbers a and b, write a method to print all odd numbers between them.
