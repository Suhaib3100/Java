import java.util.*;
class pin{
    private int pinno;
    String name,custid;
    Scanner sc=new Scanner(System.in);
    public void read(){
        name=sc.next();
        custid= sc.next();
        pinno= sc.nextInt();
        validate();
    }
    private void validate(){
        if(pinno==1234)
            System.out.println("WELCOME");
        else
            System.out.println("Invalid Pin");
    }
}
public class q12 {
    public static void main(String[] args) {
            pin p1=new pin();
            p1.read();

    }
}
