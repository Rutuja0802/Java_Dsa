// sorting using inbuilt function
import java.util.Scanner;
// import java.util.Arrays;
public class SelectionSort{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
            //taking size of the array
        System.out.print("enter size of array : ");
        int size=scn.nextInt();
        //adding elements in array
        int[] arr=new int[size];
        // int[] arr={ 1,3,5,2,7,9,8};
        input(arr,size);
        PrintArray(arr);

        selectionSort(arr);
        PrintArray(arr);

        

        
        
    }
        public static void input(int[] arr,int size){
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        
        }
    }
    
public static void selectionSort(int[] arr){
    int len=arr.length;
        for (int i =len-1;i>=0;i--){
            int maxidx =0;//index of maximum value
            for(int j=0;j<=i;j++){
               if(arr[j]>arr[maxidx]){
                   maxidx = j;
               }
            }
            swap(arr,i,maxidx);//calling swap
        }
    }
    public static void swap(int[] arr,int i , int j){
        arr[j]=((arr[i]+arr[j])-(arr[i]=arr[j]));
    }
    public static void PrintArray(int[] arr){
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}


