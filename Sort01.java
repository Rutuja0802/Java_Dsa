import java.util.Scanner;
public class Sort01 {
public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,1,0,1,1,0};
		sort01(arr);
        Printarr(arr);
	}
public static void Printarr(int[] arr) {
	for(int ele:arr) {
		System.out.print(ele+" ");
	}
}

public static void swap(int[] arr,int i,int j) {
	arr[j]=((arr[i]+arr[j])-(arr[i]=arr[j]));
}
 public static void sort01(int[] arr) {
	 int j=0;
	 int i =0;
	 while(j<arr.length) {
		 if(arr[j]==0) {
			 swap(arr,j,i);
			 i++;
			 j++;
				 
			 
		 }else {
			 j++;
		 }
	 }
 }
}
