package com.assignment.first_java;
import java.util.Scanner;
public class a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            int a = in.nextInt();
            if (a % 2 == 0) {
                System.out.println("Its even");
            } else {
                System.out.println("Its odd");
            }
        }
    }
}