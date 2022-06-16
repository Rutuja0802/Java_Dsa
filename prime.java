//prime number-only divisible by 1 or itself
import java.util.Scanner;
public class prime{
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args){
        //check prime no. or not
        int n= scn.nextInt();
        boolean prime=true;
for(int i=2;i<=n-1;i++){
    if(n % i == 0){
        // System.out.println("not prime");
        prime=false;
        break;
    }
}
if(prime){
    System.out.print("number is prime");
}else{
    System.out.print("number is not prime");
}
    }
}