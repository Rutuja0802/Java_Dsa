import java.util.Scanner;
public class printEvenElement{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        //given size of array frommm user
        System.out.print("Enter size of array : ");
        int size=Integer.parseInt(scn.next());

        //adding elements in array from user
        System.out.print("enter elements in array");
        int [] arr=new int[size];

        //calling functions
        input(arr,size);
        EvenElement(arr);
    }
    public static void input(int arr[],int size){
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
    }
    public static void EvenElement(int arr[]){
    for(int i=0;i<arr.length;i++){
        if(arr[i]%2==0){
          System.out.print(arr[i]+" ");

        }
          System.out.println();

    }
    }
}