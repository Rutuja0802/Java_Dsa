
        import java.util.Scanner;
public class logical{
    public static Scanner scn =new Scanner(System.in);
    public static void main(String[] args){
          System.out.print("enter roll.no 1 marks :");
        int m1= scn.nextInt();
          System.out.print("enter roll.no 2 marks :");
        int m2= scn.nextInt();
        if(m1<50&&m2<50){
            System.out.println("both are fail");
        }else if(m1<50&&m2>50){
             System.out.println("m1 is fail");
        }else if(m1>50&&m2<50){
             System.out.println("m2 is fail");
        }else{
             System.out.println("both are pass");
        }
    }
}
    