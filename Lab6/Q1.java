
import java.util.*;

class Q1 {
  public static int add(int x, int y) {
    return x + y;
  }

  public static int multiply(int x, int y) {
    return x * y;
  }

  public static int Subtract(int x, int y) {
    return x - y;
  }

  public static double divide(int x, int y) {
    return (double) x / y;
  }

  public static int remainder(int x, int y) {
    return x % y;
  }

  public static double sqrt(int n) {
    return Math.sqrt(n);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.println("----- SIMPLE CALCULATOR -----");
      System.out.println("1. Addition");
      System.out.println("2. Subtraction");
      System.out.println("3. Multiplication");
      System.out.println("4. Division");
      System.out.println("5. Remainder");
      System.out.println("6. Square Root");
      System.out.println("7. Exit");

      System.out.print("Choose an option: ");
      int op = sc.nextInt();

      if (op == 7) {
        System.out.println("Exiting...");
        break;
      }
      if (op == 6) {
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        if (n < 0) {
          System.out.println("Not valid");
          continue;
        } else {
          System.out.println("Square root: " + sqrt(n));
          continue;
        }
      }

      System.out.print("Enter x: ");
      int x = sc.nextInt();
      System.out.print("Enter y: ");
      int y = sc.nextInt();

      switch (op) {
        case 1:
          System.out.println("Addition is: " + add(x, y));
          break;
        case 2:
          System.out.println("Subtraction is: " + Subtract(x, y));
          break;
        case 3:
          System.out.println("Multiplication is: " + multiply(x, y));
          break;
        case 4:
          if (y == 0)
            System.out.println("Not possible");
          else
            System.out.println("Result: " + divide(x, y));
          break;
        case 5:
          System.out.println("Result = " + remainder(x, y));
          break;
      }
    }
    sc.close();
  }
}