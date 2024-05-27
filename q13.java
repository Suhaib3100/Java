import java.util.Scanner;

class Shape {
    float area;


    public void calcArea(float a) {
        area = a * a;
        System.out.println("The area of the square is: " + area);
    }


    public void calcArea(float a, float b) {
        area = a * b;
        System.out.println("The area of the rectangle is: " + area);
    }
}

public class q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of dimensions (1 for square, 2 for rectangle): ");
        int dimensions = sc.nextInt();

        Shape shape = new Shape();

        if (dimensions == 1) {
            System.out.println("Enter the side length of the square: ");
            float side = sc.nextFloat();
            shape.calcArea(side);
        } else if (dimensions == 2) {
            System.out.println("Enter the length and width of the rectangle: ");
            float length = sc.nextFloat();
            float width = sc.nextFloat();
            shape.calcArea(length, width);
        } else {
            System.out.println("Invalid number of dimensions entered.");
        }

        sc.close();
    }
}
