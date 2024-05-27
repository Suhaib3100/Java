/* Write a program to accept the length of two line segments and check whether they are equal or
unequal. Display the message accordingly.
Requirements:
a) Read the length of two line segments from user.
        b) Display “Equal” if they are equal otherwise “Not Equal”.*/

import java.util.Scanner;
public class king {
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a==b){
                System.out.println("Equal");
            }
            else
                System.out.println("Not Equal");


        }
}
