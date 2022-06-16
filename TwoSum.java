import java.util.Scanner;
public class TwoSum{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        //two sum array
        //enter size of array
        int size=scn.nextInt();
        //create a array for size
        int[] arr=new int[size];
        //take a value from user
        int sum=scn.nextInt();
        //fun call
        input(arr,size);
        PairSum(arr,sum);
    }
    //loop for adding elements in array
    public static void input(int[] arr,int size){
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
    }
      //loop for two sum
      public static void PairSum(int[] arr,int sum){
          for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length; j++){
                if(arr[i] + arr[j] == sum){
                 System.out.print("["+i+","+j+"]");
            

                }
            }

          }

      }
    }
