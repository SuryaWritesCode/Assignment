
import java.util.*;

class Q5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter n: ");
    int n = sc.nextInt();

    int total = 0;
    for (int i = 1; i <= n; i++) {
      int partial = 0;
      for (int j = 1; j <= i; j++) {
        partial += j;
      }
      total += partial;
    }

    System.out.println("Sum is: " + total);

    sc.close();
  }
}