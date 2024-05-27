import java.util.*;
public class q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        if(s%4==0 && (s%100!=0 || s%400==0))
            System.out.println("Leap Year");
        else
            System.out.println("Not a Leap Year");
    }
}
