import java.util.Scanner;
public class array1{
    public static Scanner scn =new Scanner(System.in);
    public static void main(String[] args){
        // int[] arr={4,6,7,8,9};
        // for(int i=0;i<=arr.length-1;i++){
            // System.out.print(arr[i]+" ");
        // }
   //for each loop
   String [] arr={
       "rutuja","pathare"
   };
        for(String ele : arr){
            System.out.print(ele+" ");
        }
    }
}