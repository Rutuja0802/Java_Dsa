// *****
// *****
// *****
// *****
// *****


import java.util.Scanner;
public class Pattern{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        pattern();
        number();
        }
            public static void pattern(){
                for(int i=1;i<=5;i++){
                    singleLine();
                    System.out.println();
                }
            }

        public static void singleLine(){
            for(int i=1;i<=5;i++){
                System.out.print("*");
            }
        }
          
          public static void number(){
              for(int i=1;i<=5;i++){
                  numberPattern();
                  System.out.println();
              }
          }
          public static void numberPattern(){
              for(int i=1;i<=5;i++){
                  System.out.print(i);
              }
          }
           
        
    }
