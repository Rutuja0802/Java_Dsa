import java.util.Scanner;
public class prime{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        int  checkPrime = scn.nextInt();
        for(int i=2; i<=checkPrime-1;i++){
            boolean prime =true;
            if(checkPrime%i==0){
             prime=false;
                break;
            }
            }
            if(prime==true){
                System.out.print("  prime");
            }else{
                System.out.print("not prime");
            }
        }
    } 
