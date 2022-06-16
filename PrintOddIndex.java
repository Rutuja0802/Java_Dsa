import java.util.Scanner;
public class PrintOddIndex{
    public static Scanner scn=new Scanner (System.in);
    public static void main(String[] args){
        //input size of array from user
        System.out.print("enter size of the array : ");
        int size=Integer.parseInt(scn.nextLine());
        //Enter element of array from user
        System.out.print("Enter elements for array : ");
        int[] arr=new int[size];
        //function calling
        input(arr,size);
        oddIndex(arr);
    }
    public static void input(int arr[],int size){
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
    }
    public static void oddIndex(int arr[]){
    for(int i=1;i<arr.length;i+=2){
          System.out.print(arr[i]+" ");
    }
    }
}