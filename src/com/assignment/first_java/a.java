package com.assignment.first_java;
import java.util.Scanner;
public class a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try{

            while (true) {
                int a = in.nextInt();
                if (a % 2 == 0) {
                    System.out.println("Its even");
                } else {
                    System.out.println("Its odd");
                }
            }
        }
        finally{
            in.close();
        }
    }
}

// ! Added try and finally block to avoid memory leak of in ... try block will be run and if it is completed then finally block which will close the in scanner variable
// had to do this because I was getting an error while running it in vscode (didnt get it last time in intellij)
// ! try finally was required here because we wanted to call in scanner again and again using while loop without try and finally it wasnt possible to create loop