import java.util.Scanner;
public class PrintAlpha{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
       
        alphabetpattern();


    }
    public static void alphabetpattern(){
        //taking number of lines in input
        //in rows
        for(int i=1;i<5;i++){
            PrintAlphaa();
            System.out.println();
        }
    }

    public static void  PrintAlphaa(){
        //taking number of element in coloumn
        for(int i=0;i<26;i++){
            System.out.print((char)('a'+i)+" ");
        }

    }
}