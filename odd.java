//Write a program to accept a number and check
//        if it's even or odd. Display an appropriate message.
import java.util.Scanner;
public class odd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Number De bhaaaya");
        int a=sc.nextInt();
        if(a%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");

    }
}
