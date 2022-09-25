package com.lectures;

import java.util.Scanner;

public class Functions {
public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  
  int n = in.nextInt();
  System.out.println(isPrime(n));
  in.close();
  
}

static boolean isPrime(int n) {
  if(n<=1){
    return false;
  }
  int c =2;
  while(c*c <=n){
    if(n%c==0){
      return false;
    }
    c++;
  }
    return c*c >n;
}
}
// static boolean isPrime(int n) {
//   if(n<=1){
//     return false;
//   }
//   int c =2;
//   while(c <n){
//     if(n%c==0){
//       return false;
//     }
//     c++;
//   }
//     return true;
// }
// }

// Q2 armstrong

// Scanner in = new Scanner(System.in);

// int n = in.nextInt();

// System.out.println(isArmstrong(n));
// in.close();
// }

//  static boolean isArmstrong(int n) {
//    int original = n;
//    int sum =0 ;
//   while (n>0) {
//     int rem = n%10;
//     n = n/10;
//     sum += rem*rem*rem;
//   }
//     return sum==original;
// }
// Q3 three digit armstrong nos.

// for(int i=100; i<1000;i++){
//   isArmstrong(i);
// }
// }
//  static void isArmstrong(int n) {
//    int original = n;
//    int sum =0 ;
//   while (n>0) {
//     int rem = n%10;
//     n = n/10;
//     sum += rem*rem*rem;
//   }
//     if(sum==original){
//       System.out.println(original);
//     }
// }
// }







  // sum();

  // int print_sum = sum();
  // System.out.println(print_sum);

  // Scanner in = new Scanner(System.in);
//   int num1 = in.nelxtInt();
//   int num2 = in.nextInt();
//   int num3 = in.nextInt();
//  int print_sum =  sum(num1,num2,num3);
//  int print_sum =  sum(5,6,7);
//  System.out.println(print_sum);
//   in.close();
// }

// static void sum(){
//   Scanner in = new Scanner(System.in);
//   int n1 = in.nextInt();
//   int n2 = in.nextInt();
//   int n3 = in.nextInt();
//   int sum = n1+n2+n3;
//   System.out.println(sum);
//   in.close();
// } 
// static int sum(){
//   Scanner in = new Scanner(System.in);
//   int n1 = in.nextInt();
//   int n2 = in.nextInt();
//   int n3 = in.nextInt();
//   int sum = n1+n2+n3;
//   in.close();
//   return(sum);
// } 
// static int sum(int n1,int n2,int n3){

//   int sum = n1+n2+n3;
 
//   return(sum);
// } 

// }
