import java.util.Scanner;
class animal{
    public void print(){
        System.out.println("We are animals we bark");
    }
}
class dog extends animal{
    public void printmessage(){
        System.out.println("we do bo bow");
    }
}
public class atif {
    public static void main(String[] args){
        //DOing inheritance
    dog mydog=new dog();
    mydog.printmessage();
    mydog.print();
    }
}
