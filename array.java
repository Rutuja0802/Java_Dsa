import java.util.Scanner;
public class array{
    public static Scanner scn =new Scanner(System.in);
    public static void main(String[] args){
        int[] arr=new int[5];
        // int value=arr[1];//arr(array name)[index] find values at that index no.
        // System.out.print(value);//default value of array is zero.


        //array length
        int len=arr.length;
        // System.out.print(len);
           arr[1]=4;
           arr[4]=6;

      
        //display array
        for(int i=0;i<=len-1;i++){
            System.out.println(arr[i]+" ");
        }
    }
}