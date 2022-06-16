// reverse array using swap method
import java.util.*;
public class ReverseArray{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
            //taking size of the array
        System.out.print("enter size of array : ");
        int size=scn.nextInt();
        //adding elements in array
        int[] arr=new int[size];
        input(arr,size);
        PrintArray(arr);
        reverse(arr);
        PrintArray(arr);
        
    }
        public static void input(int[] arr, int size){
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
            reverse(arr);
        }
    }
    public static void reverse(int[] arr){
        for (int i =0;i<arr.length/2;i++){
            // swap ->(arr[i],arr[arr.length-i-1])
            // swap formula--> b=((a+b)-(a=b))
            // a=arr[i]
            // b=arr[j]
            int j=arr.length-i-1;
            arr[j]=((arr[i]+arr[j]) - (arr[i]=arr[j]));
        }
    }
// public static void PrintArray(int[] arr){
//         for (int i =0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }

public static void PrintArray(int[] arr){
    for(int ele : arr){
        System.out.print(ele +" ");
    }
    System.out.println();
}

}