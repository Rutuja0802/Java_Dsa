import java.util.Scanner;
public class calculator{
    public static Scanner scn= new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("enter 0 for addition\n enter 1 for substration\n enter 2 for multiplication\n enter 3 for divide\n enter 4 for reminder : ");
     int c=scn.nextInt();
     if(c>4){
                    System.out.print("invalid option");

     }
     System.out.print("enter num-1: ");
     int a=scn.nextInt();
     System.out.print("enter num-2: ");
     int b=scn.nextInt();
     
       if(c==0){
           int add =add(a,b);
           System.out.print(add);
       }else if(c==1){
           int sub=sub(a,b);
           System.out.print(sub);

       }else if(c==2){
           int mul=mul(a,b);
           System.out.print(mul);

       }else if(c==3){
           double div=div(a,b);
           System.out.print(div);

       }else if(c==4){
           int rem =rem(a,b);
           System.out.print(rem);

       }else{
                      System.out.print("invalid option");

       }
    

    }
    public static int add(int a,int b){
        return a+b;
    }
        public static int mul(int a,int b){
        return a*b;
    }
        public static int sub(int a,int b){
        return a-b;
    }
        public static double div(int a,int b){
        return (double)(a)/b;
    }
        public static int rem(int a,int b){
        return a%b;
    }
}