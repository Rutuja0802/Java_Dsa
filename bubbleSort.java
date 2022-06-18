import java.util.Scanner;
public class bubbleSort{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        int[] arr={7,8,9,5};
        print(arr);
        BubbleSort(arr);
        print(arr);
    }
    public static void BubbleSort(int[] arr){
        for (int i=0;i<arr.length;i++){
            for(int j =0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                 swap(arr,j,j+1);
                }
            }
        }
    }


    public static void swap(int[] arr,int i,int j){
        arr[j]=((arr[i]+arr[j])-(arr[i]=arr[j]));
    }

    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
}