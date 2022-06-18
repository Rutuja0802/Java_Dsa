import java.util.Arrays;
import java.util.Scanner;

public class HalfAscendingHalfDescending {
public static Scanner scn=new Scanner(System.in);
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
      int n=scn.nextInt();
      int[] arr=new int[n];
      InputInArray(arr);
      PrintIncDec(arr);
	}
	public static void InputInArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
		}
	}
	public static void PrintIncDec(int[] arr) {
	//sort the array
//		Arrays.sort(arr);inbuilt method for sorting array
		insertionSort(arr);
		int n=arr.length;
		for(int i=0;i<(n/2);i++) {
			System.out.print(arr[i]+" ");
		}
		for(int i=n-1;i>=(n/2);i--) {
			System.out.print(arr[i]+" ");
		}
	}
         public static void insertionSort(int[] arr) {
        	 for(int i=0;i<arr.length;i++) {
        		 for(int j=i-1;j>=0;j--) {
        			 if(arr[j]>arr[j+1]) {
        				 swap(arr,i,j+1);
        			 }
        		 }
        	 }
         }
         public static void swap(int[] arr,int i,int j) {
        	 arr[j]=((arr[i]+arr[j])-(arr[i]=arr[j]));
         }
}
