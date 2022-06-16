import java.util.Scanner;

public class TwoDArray {
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
 public static void Print(int[][] arr) {
	 for(int i=0;i<arr.length;i++) {
		 for(int j=0;j<arr[0].length;j++) {
			 System.out.print(arr[i][j]+" ");
		 }
		 System.out.println();
	 }
 }
}
