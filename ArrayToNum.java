import java.util.Scanner;
public class ArrayToNum{
    public static Scanner scn=new Scanner (System.in);
    public static void main(System.in){
        // int n=scn.nextInt();
        // int[] arr=new int[n];
        int arr={2,3,4,5}
        int ans=Arraytonum(arr);
    }
    public static void Arraytonum(int[] arr){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans=(ans)*10+arr[i];
        }
        return ans;
    }
}