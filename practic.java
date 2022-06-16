import java.util.Scanner;
public class practic{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        // for(int i=1; i<=16;i++){
            // System.out.print(i+" ");
            // if(i%4==0){
            // System.out.println();

        //     }
        // }




        // for(int i=1; i<=4;i++){
        //     for(int j=1;j<=4;j++){
        //         System.out.print((j+(i-1)*4)+" ");
        //     }


            
        //     System.out.println();

        // }


        
        for(int i=0; i<=3;i++){
            for(int j=1;j<=4;j++){
                System.out.print((j+(i)*4)+" ");
            }


            
            System.out.println();

        }
    
    
    }
}
