import java.util.Scanner;
public class cal{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
 System.out.println("enter no.1 : ");
 int a =scn.nextInt();
  System.out.println("enter no.2 : ");
 int b =scn.nextInt();
 System.out.print("enter 0 :add ,1:sub,2:mul,3:divide,4:reminder :");
int c=scn.nextInt();

if(c==0){
    System.out.println(a+b);
}else if(c==1){
      System.out.println(a-b);
}else if(c==2){
      System.out.println(a*b);
}else if(c==3){
      System.out.println(a/b);
}else{
      System.out.println(a%b);
}
}
 
}