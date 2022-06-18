import java.util.Scanner;

public class ReverseNumber {
	static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
        int n=scn.nextInt();
        int ans=ReverseNum(n);
        System.out.print(ans);
	}
 public static int ReverseNum(int n) {
	 int ans=0;
	 while(n!=0) {
		 int LastDigit=(n%10);
		 n=n/10;
		 ans=ans*10+LastDigit;
	 }
	 return ans;
 }
}
