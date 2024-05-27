/*Klaus wants to know his overall grade, which is calculated based on the average marks he achieved
in all six subjects. Write a program to help him to determine the grade based on the following criteria.
        A: 90-100%
B: 80-89%
C: 70-79%
D: 60-69%
F: Below 60%
Requirements:
c) The individual marks scored by Klaus in all the six subjects has to be captured
d) The total and average mark has to be displayed.
        e) Grade has to be displayed based on the average he scored.*/
import  java.util.Scanner;
public class prob3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        int f=sc.nextInt();
        int total=a+b+c+d+e+f;
        int avg=(a+b+c+d+e+f)/6;
        char grade;
        System.out.println("Total"+total);
        System.out.println("avg"+avg);
        if(avg>=90)
            grade='A';
        else if(avg>=80 && avg<=89)
            grade='B';
        else if(avg>=70 && avg<=79)
            grade='C';
        else if(avg>=60 && avg<=69)
            grade='D';
        else
            grade='F';
        System.out.println("Grade "+grade);
    }
}
