
// USING LOOPS

import java.util.*;

class Q12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter m: ");
    int m = sc.nextInt();
    System.out.print("Enter n: ");
    int n = sc.nextInt();

    if (m <= 0 || n <= 0) {
      System.out.println("Wrong input");
      sc.close();
      return;
    } else if (m > n) {
      int t = m;
      m = n;
      n = t;
    }
    for (int i = m; i <= n; i++) {
      int fact = 1;
      for (int j = 1; j <= i; j++) {
        fact *= j;
      }
      System.out.println("Factorial of " + i + " is " + fact);
    }

    sc.close();
  }
}
