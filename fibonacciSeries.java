 import java.util.Scanner;
 public class fibonacciSeries{
     public static Scanner scn=new Scanner (System.in);
     public static void main(String[] args){
       int n=scn.nextInt();
      int ans= fibonacciSeries(n);
       System.out.println(ans);
     }
     public static int fibonacciSeries(int n){
         int a=0;
         int b=1;
         int c=0;
         for(int i=1;i<=n-2;i++){
             c=a+b;
             a=b;
             b=c;
         }
         return c;
     }
 }