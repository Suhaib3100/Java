/*Write a program to read an option from user to choose finding area and perimeter of Square,
Rectangle and Circle.
The application has to provide a menu to the user to choose the options.
The application should provide the options continuously to the user till user choose 4th option exit.*/
import java.util.Scanner;

public class prob4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;

        while (true) {
            System.out.println("1. Square");
            System.out.println("2. Rectangle");
            System.out.println("3. Circle");
            System.out.println("4. Exit");
            System.out.println("Enter the option");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter Length of side");
                    float side = sc.nextFloat();
                    System.out.println("Area " + (side * side));
                    System.out.println("Perimeter " + (4 * side));
                    break;
                case 2:
                    System.out.println("Enter the Length");
                    float length = sc.nextFloat();
                    System.out.println("Enter the breadth");
                    float breadth = sc.nextFloat();
                    System.out.println("Perimeter " + (2 * (length + breadth)));
                    System.out.println("Area " + (length * breadth));
                    break;
                case 3:
                    System.out.println("Enter the Radius");
                    float radius = sc.nextFloat();
                    System.out.println("Area " + (3.14 * radius * radius));
                    System.out.println("Perimeter " + (2 * 3.14 * radius));
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
    }
}
