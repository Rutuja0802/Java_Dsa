import java.util.Scanner;
public class ReverseArray{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        //taking size of the array
        System.out.print("enter size of array");
        int size=scn.nextInt();
        //adding elements in array
        int[] arr=new int[size];
        input(arr,size);
        PrintArray(arr);
        Reverse(arr);
        PrintArray(arr);

    }
    public static void input(int[] arr, int size){
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
    }
    // 26Apr\ReverseArray.java
    // E:\java\26Apr\ReverseArray.java

    public static void Reverse(int[] arr){
        // new array
        int[] copy=new int[arr.length];
        int j=0;
        // fill copy array in reverse order
        for(int i=arr.length-1;i>=0;--i){
            copy[j]=arr[i];
            j++;
        }
        // copy "copy" into arr
        for (int i =0;i<arr.length;i++){
            arr[i]=copy[i];
        }
    }

    public static void PrintArray(int[] arr){
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}