//Triangle Type: Write a program to accept the
//lengths of three sides and determine if they form an
//        equilateral triangle, isosceles triangle, scalene triangle,
//or if they don't form a triangle at all.
import java.util.Scanner;
public class prob10 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        if(a+b<=c || a+c<=b || b+c<=a)
            System.out.println("Not a trainagle");
           if(a==b && b==c){
                System.out.println("Equilateral");
            }
            else if(a==b || a==c || b==c){
                System.out.println("Isoslelus");
            }
            else
                System.out.println("Scalene");



    }
}
