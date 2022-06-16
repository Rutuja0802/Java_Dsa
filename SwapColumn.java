import java.util.Scanner;
public class SwapColumn {
public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int r=scn.nextInt();
          int c=scn.nextInt();
          int[][] arr= new int[r][c];
          Input(arr);
          SwapColumn(arr);
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

	public static void SwapColumn(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			ReverseArray(arr,i);
		}
	}
	public static void ReverseArray(int[][] arr,int i) {
		for(int j=0;j<arr[0].length-1;j++) {
			swap(arr,i,j,i,arr[0].length-j-1);
		}
	}
		public static void swap(int[][] arr,int i,int j,int k,int l) {
			arr[k][l]=((arr[i][j] + arr[k][l] ) - (arr[i][j]=arr[k][l]));
			
		}
}
