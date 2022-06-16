
// * * * * * 
// * * * * 
// * * * 
// * * 
// * 





import java.util.Scanner;
public class ReverseRight{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
           NoOfRows();
    }

    public static void NoOfRows(){
        int a=5;
        for(int i=a;i>=1;--i){
            PrintReverseRightTriangle(i);
            System.out.println();

            
        }
    }
            
            
    public static void PrintReverseRightTriangle(int star){
    
        for(int i=1;i<=star;i++){
         System.out.print("*"+" ");
        }
    }

}