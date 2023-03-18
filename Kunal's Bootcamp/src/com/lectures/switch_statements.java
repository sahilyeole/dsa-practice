package com.lectures;
import java.util.Scanner;
public class switch_statements {
    public static void main(String[] args) {
        // if a & b variables point to same object lets say kunal '==' will return true but if a points to object kunal & b ponts to some other object kunal (same value but diff obj)
        //then == will return false.... so to avoid this we use .equals

        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        // program : print first letter of a fruit inputted
        // instead of multiple if statements we use switch statements
        //by old switch statements syntax

//        switch (fruit) {
//            case "Mango":
//                System.out.println("M");
//                break; //it breaks the program there itself if condition is satisfied... it dont proceed forward then
//            case "Apple":
//                System.out.println("A");
//                break;
//            case "Banana":
//                System.out.println("B");
//                break;
//            default:
//                System.out.println("idk"); // default is a generic term to be run if any of the condition is not satisfied
        //no need of break here
//        }
        switch (fruit) { //enhanced switch syntax
            case "Mango" -> System.out.println("M");
            case "Apple" -> System.out.println("A");
            case "Banana" -> System.out.println("B");
            default -> System.out.println("idk");
        }
        in.close();
    }



}
