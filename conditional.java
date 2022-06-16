import java.util.Scanner;
public class conditional{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        //given three subject marks if one of the subject is less than 50 then student will be fail.
        int m1=scn.nextInt();
        int m2=scn.nextInt();
        int m3=scn.nextInt();
        if(m1 < 50 || m2<50||m3<50){
            System.out.print("fail");
        }else{
            System.out.print("pass");

        }

    }
}