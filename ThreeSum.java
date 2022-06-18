import java.util.Scanner;

public class ThreeSum {
static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int size=scn.nextInt();
//		int[] arr=new int[size];
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=scn.nextInt();
//		}
		int[] arr= {12,3,4,5,6};
		int Target=12;
		ThreeSum(arr,Target);

	}
	public static void ThreeSum(int[] arr,int Target) {
		for(int i=0;i<arr.length;i++) {
			if (i!=0 && arr[i] == arr[i -1]) {
			 continue;
			}
			twoSum(arr,Target-arr[i],i+1,arr.length-1);
		}
	}
	public static void twoSum(int[] arr,int Target,int st,int end) {
		int firstValue=arr[st-1];
		while(st<end) {
		while(end != arr.length-1 && arr[end]==arr[end+1]) {
				end--;
			}
			int sum=arr[st]+arr[end];
			if(sum==Target) {
				System.out.println("("+firstValue +","+arr[st]+","+arr[end]+")");
				st++;
				end--;
			}else if(sum<Target) {
				st++;
			}else {
				end--;
			}
		}
	}

}
