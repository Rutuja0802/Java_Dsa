import java.util.Scanner;
public class Transpose {
public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int r=scn.nextInt();
  int c=scn.nextInt();
  int[][] arr=new int[r][c];
  Input(arr);
  Transpose(arr);
  Print(arr);
  }
	public static void Input(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]=scn.nextInt();			}
		}
	}
	
	public static void Transpose(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr[0].length;j++) {
			Swap(arr,i,j);
			}
		
		}
	}

	public static void Swap(int[][] arr,int i,int j) {
		arr[j][i]=( (arr[i][j] + arr[j][i]) - (arr[i][j] = arr[j][i]) );
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
