import java.util.*;
public class q2  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        int c=sc.nextInt();
        if(a> b && a > c){
            if((a*a)==(b*b)+(c*c))
                System.out.println("Pyht Triplets");
            else
                System.out.println("Not a Triplet");
        }
        else if(b>a && b>c){
            if((b*b)==(a*a)+(c*c))
                System.out.println("Pyth triplets");
            else
                System.out.println("Not a triplets");
        }
        else
            if((c*c)==(a*a)+(b*b))
                System.out.println("Pyhr tr");
            else
                System.out.printf("Not a");
    }
}
