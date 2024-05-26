import java.util.Scanner;
class base{
    base(){
        System.out.println("I am a base constructor");
    }
    base(int a){
        System.out.println("I am a parametised base contracutd "+a);
    }

}
class derived extends base{
    derived(){
        super(10);
        System.out.println("I am derived class contructor");
    }

}
public class atif {
    public static void main(String[] args) {
        derived d=new derived();
    }
}
