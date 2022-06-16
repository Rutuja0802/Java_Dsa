import java.util.Scanner;
public class time{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("enetr a time in 24hr format");
        int a=scn.nextInt();
        if(a<12){
            System.out.print("good morning");
        }else if(a<=16){
            System.out.print("good Afternoon");
        }else if(a<=20){
            System.out.print("Good afternoon");
        }else{
            System.out.print("good night");
        }
    }
}