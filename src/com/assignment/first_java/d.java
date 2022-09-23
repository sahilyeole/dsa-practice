package com.assignment.first_java;
import java.util.Scanner;
public class d {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try{
            while (true) {
                int a = in.nextInt();
                int b = in.nextInt();
                int c = in.nextInt();
                int d = in.nextInt();
                int f = (a + c) / d;
                if (b > 20) {
                    f = f * b;
                }
                System.out.println(f);
            }
        }
        finally{
            in.close();
        }
    }
}