import java.util.Scanner;
public class printline{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        //print no. in     1  2  3  4
                        // 5  6  7  8
                        // 9 10 11 12

                        for(int i =1;i<= 12;i++){
                             System.out.print(i+" ");
                            if((i%4)==0){
                                System.out.println();//new line
                            }
                        }
    }
}