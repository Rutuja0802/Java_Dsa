
import java.util.Scanner;

public class PrintTwoDArrayUsingSingleLoop {
public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        row
		int r=scn.nextInt();
//		column
		int c=scn.nextInt();
		
		int[][] arr=new int[r][c];
//		input 
		Input(arr);
//		print
		Print(arr);
	}
	public static void Input(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]=scn.nextInt();
			}
		}
	}
 public static void Print(int[][] arr,int r,int c,int i,int j,int idx) {
	
	 int idx1=i*arr.length+j;
	 int i=idx1/arr[0].length;
	 int j=idx1%arr[0].length;
	 for(int idx=0;idx<r*c;idx++) {
		 
			 System.out.print(arr[i][j]+" ");
		 }
		 System.out.println();
	 }
 
}
