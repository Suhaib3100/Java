import java.util.*;
class student{
        String name;
        int rank;
        Scanner sc=new Scanner(System.in);
        public void read(){
            name= sc.next();
             rank= sc.nextInt();
        }
        public void write(){
            System.out.println(name);
            System.out.println(rank);
        }
}

public class q8 {
    public static void main(String[] args) {
            student s1=new student();
            s1.read();
            s1.write();
    }
}
