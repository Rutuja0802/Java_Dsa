import java.util.Scanner;
public class nestedloop{
    public static Scanner scn =new Scanner(System.in);
    public static void main(String[] args){
             System.out.print("enter time in 24hr format");
             int time=scn.nextInt();
             if(time<12){
                 System.out.print("good morning");
             }else{
                 if(time<=16){
                     System.out.print("good afternoon");
                 }else{
                     if(time<=20){
                         System.out.print("good evening");
                     }else{
                         System.out.print("good night");
                     }
                 }
             }
    }
    }
