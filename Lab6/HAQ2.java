
import java.util.*;

class Q2 {
  public static boolean areConsecutive(int a, int b, int c) {
    return (b == a + 1 && c == b + 1) || (b == a - 1 && c == b - 1);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Input the first number: ");
    int x = sc.nextInt();
    System.out.print("Input the second number: ");
    int y = sc.nextInt();
    System.out.print("Input the third number: ");
    int z = sc.nextInt();

    System.out.println("Check whether the three said numbers are consecutive or not! "
        + areConsecutive(x, y, z));

    sc.close();
  }
}
