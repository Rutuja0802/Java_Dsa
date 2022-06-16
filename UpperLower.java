import java.util.Scanner;
public class UpperLower{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        char a='p';
        //convert into uppercase
        char upper=(char)(a-32);
        System.out.println(upper);

        //to lower case +32
char b='A';
char lower=(char)(b+32);
System.out.println(b);
    }
}