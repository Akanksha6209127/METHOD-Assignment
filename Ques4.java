package MethodAssignment;

import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int count = 0;
        while(n>0){
          n = n/10;
          count++;
        }
        System.out.print(count*count+" ");
    }
}
// Ques.4 Write a method to count the number of digits in a number and then print the square of this number.
// Ques.5 State True and False :-
// Ques.5(i) A method may be called more than once from any other method it is necessary for a method to return some value.
// False
//(ii) Can the same method name be used for different method without any conflict?
// False