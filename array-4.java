import java.util.Scanner;

public class atif2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<=4;i++){
            System.out.println("Enter element "+(i+1)+":");
            arr[i]=sc.nextInt();
        }
        int max=0;
        for(int element:arr){
            if(element>max)
                max=element;
        }
        System.out.println(max);
    }
}
