import java.util.Scanner;
public class countOccurance{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("enter size of array");
        int size=Integer.parseInt(scn.next());

        int[] arr=new int[size];
        input(arr,size);//input
        int value=scn.nextInt();//value to search
        CountOccurance(arr,value);
    }
       public static void input(int arr[], int size){
           for(int i = 0; i < arr.length ;i++){
               arr[i]=scn.nextInt();
           }
       

}
public static void CountOccurance(int[] arr,int value){
    int count=0;
      for(int i=0;i<arr.length;i++){
          if(arr[i]==value){
              count++;
          }
      }
      System.out.println(count);
}
}