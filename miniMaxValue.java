import java.util.Scanner;
public class miniMaxValue{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
            System.out.print("Enetr size of array : ");
        int size=Integer.parseInt(scn.next());
        //enter elements of the array
        int[] arr=new int[size];
        input(arr,size);
        min(arr);
        max(arr);
        
    }
   public static void input(int[] arr,int size){
       for(int i=0;i<arr.length;i++){
           arr[i]=scn.nextInt();
       }
   }

   public static void min(int[] arr){
  int minValue=Integer.MAX_VALUE;
       for(int i=0;i<arr.length;i++){
  if(arr[i]<minValue){
      minValue=arr[i];
  }
       }
       System.out.print(minValue);
   }

    public static void max(int[] arr){
  int max=Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++){
  if(arr[i]>max){
      max=arr[i];
  }
       }
       System.out.print(max);
   }
    } 
