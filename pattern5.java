// * 
// * * 
// * * * 
// * * * * 
// * * * * * 
// * * * * * 
// * * * * 
// * * * 
// * * 
// * 






import java.util.Scanner;
public class pattern5{
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args){
        PrintTriangleInput();
        PrintReverseTriangleInput();

    }
    public static void PrintTriangleInput(){
        int a=5;
        for(int i=1;i<=a;i++){
            PrintTriangle(i);
            System.out.println();
        }
    }

    public static void PrintTriangle(int star){
        for(int i=1;i<=star;i++){
            System.out.print("*"+" ");
        }
    }
    //for reverse triangle

    public static void PrintReverseTriangleInput(){
        int a=5;
        for(int i=a;i>=1;i--){
            PrintReverseTriangle(i);
            System.out.println();
        }
    }

    public static void PrintReverseTriangle(int star){
        for(int i=1;i<=star;i++){
            System.out.print("*"+" ");
        }
    }
}