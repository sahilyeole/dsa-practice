package com.lectures;

import java.util.Scanner;

public class Conditionals_loops {
    public static void main(String[] args) {
        // while loop + if else
//        while (true) {
//            Scanner inp = new Scanner(System.in);
//            System.out.print("Enter salary: ");
//            float salary = inp.nextFloat();
//            if (salary > 20000) {
//                System.out.println("good salary");
//            } else if (salary == 20000) {
//                System.out.println("ok-ok salary");
//            } else {
//                System.out.println("bad salary");
//            }
          //for loop, print first n nos.:
//            Scanner in = new Scanner(System.in);
//            int n = in.nextInt();
//            for( int num = 1; num <= n; num += 1  ) {
//                System.out.println(num);
//            }

//        }

        //Q1. Find the largest no.
        Scanner input = new Scanner(System.in);
        try{

            while(true){
                System.out.print("Enter the no.1: ");
            int num1 = input.nextInt();
            System.out.print("Enter the no.2: ");
            int num2 = input.nextInt();
            System.out.print("Enter the no.3: ");
            int num3 = input.nextInt();
        // comparing one no. with other two
            //My solution
//            if (num1>num2 & num1>num3) {
//                System.out.println("num1 greatest");
//            }
//            else if (num2>num3 & num2 >num1) {
//                System.out.println("num2 greatest");
//            }
//            else if (num3>num2 & num3 >num1) {
    //                System.out.println("num3 greatest");
    //            }
    //Kunal's Solution
    int max = num1;
    if (num2>max) {
        max = num2;
    }
    if (num3>max) {
        max = num3;
    }
    System.out.println("Largest no. is "+max);
}

}
finally{
    input.close();
}
}
}
