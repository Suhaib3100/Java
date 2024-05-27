import java.util.*;
class Applicant
{
    String name,city;
    static int count;
    Scanner sc=new Scanner(System.in);
    public Applicant()
    {
        name=sc.next();
        city=sc.next();
        count++;
    }
}
public class a11
{
    public static void main(String[] args)
    {
        Applicant a1=new Applicant();
        Applicant a2=new Applicant();
        Applicant a3=new Applicant();
        Applicant a4=new Applicant();
        System.out.println(Applicant.count);
    }
}

