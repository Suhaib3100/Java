import java.util.Scanner;

public class atif2 {
    public static void main(String[] args) {
   //Take the user input by asking the how many students then ask for each student input and find out the average marks
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many students");
        int students= sc.nextInt();
        int marks[]=new int[students];
        for(int i=0;i<marks.length;i++){
            marks[i]=sc.nextInt();
        }
        int   total=0;
        for(int element:marks){
            total=total+element;
        }
        int avg=total/marks.length;
        System.out.println(avg);
    }
}
