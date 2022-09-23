package com.assignment.first_java;
import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter your name:");
    String name = input.next();
    System.out.print("Hello "+ name );
    input.close();
    }
}
// ! here try and finally isnt required as we are not using any loop / infinte loop