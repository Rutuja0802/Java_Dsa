import java.util.Scanner;
public class pattern6{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter number of lines");
        int n=scn.nextInt();
        int numOfLine1=(n/2);
        int numOfLine2=(n/2)+1;
              
        
//fun call
UpperTriangle(numOfLine1);
LowerTriangle(numOfLine2);
    }
    public static void UpperTriangle(int n){
        
    
        for(int i=1;i<=n;i++){
            PrintUpperTriangle(i);
            System.out.println();
        }
    }
    public static void PrintUpperTriangle(int star){
        for(int i=0;i<=star;i++){
            System.out.print("*"+" ");
        }
    }
    //reverse triangle
    public static void LowerTriangle(int n){
            
        for(int i=1;i<=n;i++){
            PrintLowerTriangle(i);
            System.out.println();
        }
    }
    public static void PrintLowerTriangle(int numOfLine2){
        for(int i=0;i<=numOfLine2;i++){
            System.out.print("*"+" ");
        }
    }

}