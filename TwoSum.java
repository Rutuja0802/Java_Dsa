import java.util.Scanner;
public class TwoSum {
public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] arr= {2,11,7,15};
         int target=9;
         TwoSum(arr,target);
//         for(int ele:arr) {
//        	 System.out.print(ele+" ");
//         }
//         	
	}
	
	public static void TwoSum(int[] arr,int target) {
		int[] ans=new int[2];
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					
					ans[0]=i;
					ans[1]=j;
					System.out.print(ans[0]+" "+ ans[1]);
				}
			}
		}
	}

}
