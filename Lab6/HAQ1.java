// Home Assignment Q1

import java.util.*;

class Q1 {
  public static double volume(int side) {
    return side * side * side;
  }

  public static double volume(double length, double width, double height) {
    return length * width * height;
  }

  public static double volume(double radius) {
    return (4.0 / 3) * Math.PI * radius * radius * radius;
  }

  public static double volume(double radius, double height) {
    return Math.PI * radius * radius * height;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.println("=== VOLUME CALCULATOR (Method Overloading) ===");
      System.out.println("1. Volume of Cube");
      System.out.println("2. Volume of Rectangular Prism (Cuboid)");
      System.out.println("3. Volume of Sphere");
      System.out.println("4. Volume of Cylinder");
      System.out.println("5. Exit");
      System.out.print("Enter your choice: ");
      int ch = sc.nextInt();

      if (ch == 5) {
        System.out.println("Exiting...");
        break;
      }

      switch (ch) {
        case 1:
          System.out.print("Enter side: ");
          int side = sc.nextInt();
          System.out.println("Volume of Cube: " + volume(side));
          break;

        case 2:
          System.out.print("Enter length: ");
          double l = sc.nextDouble();
          System.out.print("Enter width: ");
          double w = sc.nextDouble();
          System.out.print("Enter height: ");
          double h = sc.nextDouble();
          System.out.println("Volume of Rectangular Prism: " + volume(l, w, h));
          break;

        case 3:
          System.out.print("Enter radius: ");
          double r1 = sc.nextDouble();
          System.out.println("Volume of Sphere: " + volume(r1));
          break;

        case 4:
          System.out.print("Enter radius: ");
          double r2 = sc.nextDouble();
          System.out.print("Enter height: ");
          double h2 = sc.nextDouble();
          System.out.println("Volume of Cylinder: " + volume(r2, h2));
          break;

        default:
          System.out.println("Invalid choice!");
      }

      System.out.println();
    }

    sc.close();
  }
}
