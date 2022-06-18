import java.util.Scanner;
public class Equilibrium{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        int size= scn.nextInt();
        int[] arr=new int[size];
        PrintArr(arr);
        Equilibrium(arr);

    }
    public static void PrintArr(int[] arr){
        for (int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();

        }
    }
    public static void Equilibrium(int[] arr){
        for(int i=0;i<arr.length;i++){
            int leftSum=sum(arr,0,i-1);
            int RightSum=sum(arr,i+1,arr.length-1);
            if(leftSum==RightSum){
                System.out.print(i+1);
                return;
            }
        }
        System.out.print(-1);
    }

    public static int sum(int[] arr,int start,int end){
        int sum=0;
        for(int i=start;i<end;i++){
            sum+=arr[i];
            
        }
        return sum;
    }
}