import java.util.Scanner;
class Number{
    protected int a;
    protected int b;
}
interface Arithemetic{
    public int add(int a,int b);
    public int sub(int a,int b);
}
class calc extends Number implements Arithemetic{
            public int add(int a,int b){
                return a+b;
            }
            public int sub(int a,int b){
                return a-b;
            }
}

public class q18{
    public static void main(String[] args) {
        calc c1=new calc();
        System.out.println(c1.add(10,20));
        System.out.println(c1.sub(20 ,10));
    }
}