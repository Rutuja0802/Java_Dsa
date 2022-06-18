import java.util.Scanner;
public class PalindromeNum {
	public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		int n=scn.nextInt();
		int ans=palindrome(n);
//		System.out.print(ans);
		CheckPalin(n,ans);
	}
    public static int palindrome(int n) {
    	int ans=0;
    	while(n!=0) {
    		int LastDigit=(n%10);
    		n=(n/10);
    		ans=(ans)*10+LastDigit;
    	}
    	return ans;
    	
    }
    public static void CheckPalin(int n, int ans) {
    	 if(n==ans) {
    			System.out.print("Palindrome");
    		}else {
    			System.out.print("Not Palindrome");
    		}
    }
   
}
