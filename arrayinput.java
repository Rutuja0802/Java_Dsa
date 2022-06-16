import java.util.Scanner;
public class arrayinput{
    public static Scanner scn =new Scanner(System.in);
    public static void main(String[] args){
    //input size

    System.out.print("Enter size of array");
    int size=scn.nextInt();
    //array initialize
    int[]arr=new int[size];

    System.out.print("Enter values in array");

     //fill array using input
     for(int i=0;i<size;i++){
         arr[i]=scn.nextInt();
     }
 //print array
 for(int i=0;i<size;i++){
     System.out.print(arr[i]+" ");
 }
    }
}