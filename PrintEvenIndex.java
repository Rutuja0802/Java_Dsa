import java.util.Scanner;
public class PrintEvenIndex{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        //give size of array from user
        System.out.print("Enter Size Of Array : ");
        int size=Integer.parseInt(scn.next());
         //adding elements in array
         int[] arr=new int[size];

         //calling functions-->
         input(arr,size);
         PrintArray(arr);//printing even index

    }
    public static void input(int arr[],int size){
        for(int i=0;i<arr.length;i++){
        arr[i]=scn.nextInt();
    }
    }
    public static void PrintArray(int arr[]){
        for(int i=0;i<arr.length;i+=2){
        System.out.print(arr[i]+" ");
    }
     System.out.println();
    }
}