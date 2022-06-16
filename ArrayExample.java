import java.util.Scanner;
public class ArrayExample{
    public static Scanner scn=new Scanner (System.in);
    public static void main(String[] args){
        //size of array
        System.out.print("enter size of array");
        int size=Integer.parseInt(scn.nextLine());
         //initialize array
        int[] arr=new int[size];
    //input array
    input(arr);

    }

    public static void input(int[] arr){
            for(int i=0;i<size;i++){
            arr[i]=scn.nextInt();
        }
    }
    public static void printArray(int[] arr){
            for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}