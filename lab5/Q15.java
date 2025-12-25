
import java.util.*;

public class Q15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n (n > 3): ");
    int n = sc.nextInt();

    int a = 0, b = 1, c = 1;
    System.out.print(a + " " + b + " " + c + " ");

    for (int i = 4; i <= n; i++) {
      int next = 0;
      for (int j = 1; j <= 3; j++) {
        if (j == 1)
          next += a;
        else if (j == 2)
          next += b;
        else
          next += c;
      }
      System.out.print(next + " ");
      a = b;
      b = c;
      c = next;
    }
    sc.close();
  }
}
