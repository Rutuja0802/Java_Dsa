//          *
//         **
//        ***
//       ****
//      *****
//     ******
//    *******
//   ********
//  *********
// **********
import java.util.Scanner;
public class pattern8{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
         tri();
    }
    public static void tri(){
        //number of lines
        int n=10;
        
        for(int i=1;i<=n;i++){
            Space(n-i);
            Star(i);
        
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