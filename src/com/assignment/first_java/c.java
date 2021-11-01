package com.assignment.first_java;
import java.util.Scanner;
public class c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter principal: ");
        float P = input.nextFloat();
        System.out.println("Enter time:");
        float T = input.nextFloat();
        System.out.println("Enter rate:");
        float R = input.nextFloat()/100;
        System.out.println("The Simple Interest is:");
        float A =  P*(1+(R*T));
        System.out.println(A);
    }
}
