import java.util.Scanner;
public class SumOfArray{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        //enter size of array
        System.out.print("Enetr size of array : ");
        int size=Integer.parseInt(scn.next());
        //enter elements of the array
        int[] arr=new int[size];
        input(arr,size);
        sum(arr);
    }
   public static void input(int[] arr,int size){
       for(int i=0;i<arr.length;i++){
           arr[i]=scn.nextInt();
       }
   }


    public static void sum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
        //    sum=sum+arr[i];
            sum+=arr[i];
        }
        System.out.print( "sum of array  "+ sum);
    }
}