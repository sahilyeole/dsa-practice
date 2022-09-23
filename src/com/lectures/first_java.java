package com.lectures;

import java.util.Scanner;
//FJP
public class first_java {

    public static void main(String[] args) {

//        int a = 1;
//        while(true) {
//            System.out.println(a);
//            a++; }

//        if(true) {
//        System.out.println("dfdsfg");
//    }
        //Celsius to fahrenheit program
        Scanner input = new Scanner(System.in);
        try{

            while (true) {
                System.out.println("Please enter temp in C");
            float tempC = input.nextFloat();
            float tempF = (tempC * 1.8f) + 32;
            System.out.println(tempF);
        }
    }
    finally{
            input.close();
        }
    }
}

