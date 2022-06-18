import java.util.Scanner;
public class ConvertArraytoNum{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        int[] arr={2,3,4,5,6};
        int ans=CovrtedArray(arr);
        System.out.print(ans);
    }
    public static int CovrtedArray(int[] arr){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans=(ans)*10+arr[i];

        }
        return ans;
    }
}