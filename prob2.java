/*
Write a program to accept three numbers and check whether they are 'Pythagorean Triplets' or not.
 If they are Pythagorean Triplets display “'Pythagorean Triplets'” otherwise display “Not a Pythagorean
Triplets”
 */
import java.util.Scanner;
public class prob2 {
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(a>b && a>c){
               if((a*a)==(b*b)+(c*c))
                   System.out.println("Pythagorean Triplets");
                else
                   System.out.println("Not Pythagorean Triplets");
            }
            else if(b>a && b>c){
                if((b*b)==(a*a)+(c*c))
                    System.out.println("Pythagorean Triplets");
                else
                    System.out.println("Not Pythagorean Triplets");
            }
            else
                if((c*c)==(a*a)+(b*b))
                    System.out.println("Pythagorean Triplets");
                else
                    System.out.println("Not Pythagorean Triplets");


        }
}
