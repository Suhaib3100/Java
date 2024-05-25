import java.util.Scanner;

public class atif2 {
    public static void main(String[] args) {
        // Reverse numbers in the array
        Scanner sc=new Scanner(System.in);
        int n=5;
            int [] arr=new int[n];
               for(int i=0;i<n;i++){
                   arr[i]=sc.nextInt();
               }
        int l = arr.length;
        int middle = l / 2; // Calculate the middle index
        int temp;

        for (int i = 0; i < middle; i++) { // Iterate up to the middle index
            temp = arr[i];
            arr[i] = arr[l - i - 1];
            arr[l - i - 1] = temp;
        }

        // Print the reversed array
        for (int element : arr) {
            System.out.println(element);
        }
    }
}
