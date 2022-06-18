
import java.util.Scanner;
public class CountDigit{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
    int n=scn.nextInt();
     int count=CountDigit(n);
     System.out.print(count);


}
public static int CountDigit(int n){
    if(n==0){
        return 1;
    }
    int count=0;
    while(n!=0){
      n=n/10;
      count++;
    }
      return count;

}

}

