// O(n) time complexity
import java.util.Scanner;
public class EquilibriumOprtimized{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        int size=scn.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();

        }
        Equilibrium(arr);

    }
    public static void Equilibrium(int[] arr){
        int leftSum=0;
        int RightSum=sum(arr,1;are.length-1);
        for(int i=0;i<arr.length;i++){
        if(leftSum==RightSum){
            System.out.print(i+1);
            return;
        }
        if(i==arr.length-1){
            break;
        }
        leftSum+=arr[i];
        RightSum-=arr[i+1];
        }
        System.out.print(-1);
        
    }

    public sttaic int sum(int[] arr,start,end){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans+=arr[i];
        }
        return ans;
    }
}