import java.util.Scanner;
public class reverseArray{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("enter size of array");
        int size=Integer.parseInt(scn.next());

        int[] array=new int[size];
        input(arr,size);//input
        reverse(arr);//reverse array printing
    }
       public static void input(int arr[], int size){
           for(int i = 0; i < array.length ;i++){
               array[i]=scn.nextInt();
           }
       }
             public static void reverse(int arr[]){
                 for(int i=array.length-1;i>=0;--i){
                     System.out.print(array[i]+" ");
                 }
                 System.out.println()
             }
}