import java.util.Scanner;

//even one side odd one side
public class parity {
	public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,5,6,7,8};
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
		 if(arr[j]%2==0) {
			 swap(arr,j,i);
			 i++;
			 j++;
				 
			 
		 }else {
			 j++;
		 }
	 }
 }

}
