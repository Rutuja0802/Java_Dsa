import java.util.Scanner;
public class ReverseArray {
public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int row=scn.nextInt();
         int column=scn.nextInt();
         int[][] arr=new int[row][column];
         Input(arr);
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
		for(int i=arr.length-1;i>=0;i--) {
			for(int j=arr[0].length-1;j>=0;j--) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
