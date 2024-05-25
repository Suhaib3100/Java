import java.util.Scanner;
class rectangle{
    int lenghth;
    int breadth;
    public int area(int lenghth,int breadth){
        return lenghth*breadth;
    }
    public int perimeter(int lenghth,int breadth){
        return 2*(lenghth+breadth);
    }
}

public class atif2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int b=sc.nextInt();
        rectangle rect=new rectangle();
        int area=rect.area(l,b);
        int perimeter=rect.perimeter(l,b);
        System.out.println(area);
        System.out.println(perimeter);
    }
}
