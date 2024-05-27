import java.util.Scanner;
public class q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int min=Calc(arr);
        System.out.println("Min : "+min);
    }

        static int Calc(int[][] arr) {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i][j] < min) {
                        min = arr[i][j];
                    }
                }
            }
            return min;
        }

}
