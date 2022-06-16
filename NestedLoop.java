import java.util.Scanner;
public class NestedLoop{
    public static Scanner scn =new Scanner(System.in);
    public static void main(String[] args){
        //finding two studends passed or failed
        System.out.print("enter roll.no 1 marks :");
        int m1= scn.nextInt();
          System.out.print("enter roll.no 2 marks :");
        int m2= scn.nextInt();
        if(m1<50){//m1fail
        if(m2<50){//m2-fail
           System.out.print("both are fail");
        }else{//m2-pass
             System.out.print("only m2 is pass");
        }
            
        }else{//m1-pass
            if(m2<50){
                 System.out.print("m2 is fail");
            }else{
                 System.out.print("both are pass");
            }
        }
    }
}