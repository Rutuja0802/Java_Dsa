import java.util.Scanner;
public class Swapping{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){

    
    //swapping no.
    System.out.print("Enter a : ");
    int a= scn.nextInt();

            System.out.print("Enter b : ");
    int b= scn.nextInt();
    System.out.println();

    //using 3rd variable
int temp=a;
a=b;
b=temp;
System.out.print(a+" "+b);


//without using 3rd formula
a=a+b;
b=a-b;
a=a-b;
System.out.print(a+" "+b);

//using single line code
b=((a+b)-(a=b));
System.out.print(a+" "+b);


}
}