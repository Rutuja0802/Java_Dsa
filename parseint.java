import java.util.Scanner;
public class parseint{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
            //   String number=scn.nextLine();
            //   int num=Integer.parseInt(number);
            //   num+=6;
            //   System.out.print(num  );


            int size =Integer.parseInt(scn.nextLine());
            String [] arr=new String[size];
            for(int i=0;i<size;i++){
                arr[i]=scn.nextLine();

            }
            for(int i=0;i<size;i++){
                System.out.print(arr[i]+" ");
            }
    }
}
 
