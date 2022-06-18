import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,2,1,9};
		palindromeCheck(arr);

	}
	public static void palindromeCheck(int[] arr) {
		boolean ispalin=true;
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			if(arr[start]!=arr[end]) {
				ispalin=false;
				break;
			}
			start++;
			end--;
			
		}
		if(ispalin==true) {
			System.out.print("Palindrome");
		}else {
			System.out.print("not palindrome");
		}
	}

}
