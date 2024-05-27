import java.util.*;
public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Priority");
        int s=sc.nextInt();
        int r,l,b,area,perimeter;
        switch (s) {
            case 1:
                System.out.println("Enter Radius");
                r=sc.nextInt();
                area=r*r;
                perimeter=4*r;
                System.out.println(area);
                System.out.println(perimeter);
            case 2:
                System.out.println("Enter Lenght and breadth");
                l= sc.nextInt();
                b= sc.nextInt();
                area=l*b;
                perimeter=2*(l+b);
                System.out.println(area);
                System.out.println(perimeter);
            case 3:
                System.exit(0);
            default:
                System.out.println("Enter Valid INPUT");
        }
   }
}
