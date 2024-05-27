//Positive, Negative, or Zero: Write a program to accept a number
//and determine whether it's positive, negative, or zero.
import  java.util.Scanner;
public class prob9 {
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        System.out.println("De bhai");
        int a=sc.nextInt();
        if(a>0){
            System.out.println("Positive");
        }
        else if(a<0){
            System.out.println("Negative");
        }
        else
            System.out.println("Zero");

    }
}
