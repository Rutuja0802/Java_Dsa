import java.util.Scanner;
public class FirstLastOccurance{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        //enter size of array
        System.out.print("Enter size of the array : ");
        int size=scn.nextInt();
        //Adding elements in array
        int[] arr=new int[size];

        input(arr,size);//input fun call

        //take one value from user for search its 1st and last occurance
        System.out.print("Enter a value from array which you want to search : ");
        int value=scn.nextInt();

        FirstLast(arr,value);//fun call

    }
    public static void input(int[] arr,int size){
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();

        }
    }
    //function for 1st last occurance
    public static void FirstLast(int arr[], int value){

        for(int i=0;i<arr.length;i++){
            if(arr[i]==value){
                System.out.print("first Occurance : "+i);
                break;
            }
        }
        for(int i=arr.length;i>=0;--i){
            if(arr[i]==value){
                System.out.print("Last Occurance : " +i);
            }
        }
    }
}