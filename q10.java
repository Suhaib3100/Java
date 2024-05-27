import java.util.*;
class Employee{
    Scanner sc=new Scanner(System.in);
    String ecode,ename;
    int monthsal,grossal;
    public void accept(){
        ecode=sc.next();
        ename=sc.next();
        monthsal= sc.nextInt();
    }
    public void calcsal(){
         grossal=monthsal*12;
    }
    public void display(){
        System.out.println(ename);
        System.out.println(ecode);
        System.out.println(grossal);
        }

}
public class q10 {
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.accept();
        e1.calcsal();
        e1.display();
    }
}
