//          *
//         ***
//        *****
//       *******
//      *********
//     ***********
//    *************
//   ***************
//  *****************
// *******************
import java.util.Scanner;
public class pattern7{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
         tri();
    }
    public static void tri(){
        //number of lines
        int n=10;
        int j=1;
        for(int i=n;i>=1;i--){
            Space(i-1);
            Star(j);
            j+=2;
            System.out.println();
        }
    }
    public static void Star(int star){
        for(int i=1;i<=star;i++){
            System.out.print("*");
        }
    }
    public static void Space(int space){
        for(int i=1;i<=space;i++){
            System.out.print(" ");
        }
    }
}