
import java.util.*;

public class Q10 {

    static int area(int side) {
        return side * side; // Square
    }

    static int area(int length, int width) {
        return length * width; // Rectangle
    }

    static double area(double radius) {
        return Math.PI * radius * radius; // Circle
    }

    static double area(double base, double height) {
        return 0.5 * base * height; // Triangle
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("=== AREA CALCULATOR (Method Overloading) ===");
            System.out.println("1. Area of Square");
            System.out.println("2. Area of Rectangle");
            System.out.println("3. Area of Circle");
            System.out.println("4. Area of Triangle");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Exiting...");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter side: ");
                    int s = sc.nextInt();
                    System.out.println("Area of Square: " + area(s));
                    break;

                case 2:
                    System.out.print("Enter length: ");
                    int l = sc.nextInt();
                    System.out.print("Enter width: ");
                    int w = sc.nextInt();
                    System.out.println("Area of Rectangle: " + area(l, w));
                    break;

                case 3:
                    System.out.print("Enter radius: ");
                    double r = sc.nextDouble();
                    System.out.println("Area of Circle: " + area(r));
                    break;

                case 4:
                    System.out.print("Enter base: ");
                    double b = sc.nextDouble();
                    System.out.print("Enter height: ");
                    double h = sc.nextDouble();
                    System.out.println("Area of Triangle: " + area(b, h));
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
            System.out.println();
        }

        sc.close();
    }
}
