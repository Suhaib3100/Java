//Mike is asking Eleven for help to figure out if he was born in a leap year. Write a program to assist
//Eleven in determining whether Mike’s birth year is a leap year or not.
//
//        Requirements:
//a) Read the year in which mike was born
//b) If it is a leap year then display “Leap year” otherwise display “Not a leap year”.
import java.util.Scanner;
public class prob7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%4==0){
            if(a%100 ==0 && a%400 !=0){
                System.out.println("Not a Leap Year");
            }
            else
                System.out.println("Leap Year");

        }
        else
            System.out.println("Not a Leap Year");

    }
}
