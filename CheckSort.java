///hackerranck question
import java.util.Scanner;
public class SelectionSort{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
sortedArrayCheck(arr);
        
    


}
public static void sortedArrayCheck(int[] arr){
    boolean sorted=true;
    for(int i=0;i<=arr.length-2;i++){
         if(arr[i+1]<arr[i]){
             sorted=false;
             break;
         }
    }
    if(sorted==true){
        System.out.println("Yes");
    }else{
        System.out.print("no");
    }
}
}

