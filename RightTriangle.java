
// * 
// * * 
// * * * 
// * * * * 
// * * * * * 
// * * * * * * 
// * * * * * * * 
// * * * * * * * * 
// * * * * * * * * * 
// * * * * * * * * * * 

import java.util.Scanner;
public class RightTriangle{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
    numOfLine();
    }

    public static void numOfLine(){
        //row
        
        for(int i=1;i<=10;i++){
            PrintStar(i);
            System.out.println();
        }
    }
    public static void PrintStar(int star){
        
         
        for(int i=1;i<=star;i++){
            System.out.print("*"+" ");
        }
    }
}