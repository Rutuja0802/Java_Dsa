import java.util.Scanner;
public class wishText{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter the Time in 24hr Format :");
        int time =scn.nextInt();
        if(time<12){
            System.out.print("Hlo Rutuja Good Morning!!");
        }else if(time<=16){
                System.out.print("Hlo Rutuja  Good afernoon!!");
        }else if(time<=20){
                System.out.print("Hlo Rutuja  Good evening!!");
    }else{
           System.out.print("Hlo Rutuja Good night!!");
    }
}
}
