
import java.util.*;

class Q9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter n: ");
    int n = sc.nextInt();

    double sum = 0.0;

    for (int i = 1; i <= n; i++) {
      double term = 2.0 * i / (2 * i - 1);
      if (i % 2 == 0)
      term = -term;
      sum += term;
    }

    System.out.println("Sum is: " + sum);
    sc.close();
  }
}