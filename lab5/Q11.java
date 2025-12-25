
import java.util.*;

class Q11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter n1: ");
    int n1 = sc.nextInt();
    System.out.print("Enter n2: ");
    int n2 = sc.nextInt();

    for (int i = n1; i <= n2; i++) {
      boolean isPrime = true;
      for (int j = 2; j < i; j++) {
        if (i % j == 0) {
          isPrime = false;
          break;
        }
      }
      if (isPrime == true && i > 1)
        System.out.print(i + "  ");
    }

    sc.close();
  }
}