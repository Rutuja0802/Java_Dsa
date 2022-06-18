import java.util.Scanner;

public class StringPalindrome {
static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str=scn.nextLine();   
         CheckPalindrome(str);
	}
        public static void CheckPalindrome(String str) {
        	boolean isPalin=true;
        	int Start=0;
        	int end=str.length()-1;
        	while(Start<end) {
        		if(str.charAt(Start)!=str.charAt(end)) {
        			isPalin=false;
        			break;
        		}
        		Start++;
        		end--;
        	}
        	if(isPalin==true) {
        		System.out.print("Palindrome");
        	}else {
        		System.out.print("Not palindromei");
        	}
        }
}
//time complexity O(N);linear
//space O(1);constant;
