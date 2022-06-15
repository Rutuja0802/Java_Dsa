 import java.util.Scanner;
 public class factorial{
     public static Scanner scn=new Scanner (System.in);
     public static void main(String[] args){
         //code for factorial
        int n=scn.nextInt();
        int ans=factorial(n);
        System.out.println(ans);
         
     }
     public static int factorial(int n){
         int product =1;
         for(int i=1;i<=n;i++){
             product*=i;
         }
         return product;
     }
 }
//  E:\java\29Apr\factorial.java