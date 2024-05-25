import java.util.Scanner;

public class atif2 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int [] marks=new int[5];
        for(int i=0;i<marks.length;i++){
            System.out.println("Element"+(i+1)+":");
            marks[i]=sc.nextInt();
        }
        System.out.println("Enter the elemt to check");
        int b= sc.nextInt();
        boolean isPresent=false;
        for(int element:marks){
            if(b==element){
                isPresent=true;
            }
        }
        if(isPresent)
            System.out.println("Present");
        else
            System.out.println("Not Present");
    }
}
