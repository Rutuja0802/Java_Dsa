import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Rearrange {
   public static Scanner scn=new Scanner(System.in);

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int size=scn.nextInt();
        int[] arr=new int[size];
        input(arr);
        MilkAndWater(arr,size);
         print(arr);
        
    }
    public static void input(int[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
    }
    
     static void MilkAndWater(int arr[], int size)
    {
        int j = 0, temp ;
        for (int i = 0; i < size; i++) {
            if (arr[i] < 0) {
                if (i != 0) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    
                    
                }
                  j++;
             }
        }
    }
 
    
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    }