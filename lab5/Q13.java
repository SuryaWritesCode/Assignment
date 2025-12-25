
import java.util.*;

class Q13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter x in radians: ");
    double x = sc.nextDouble();

    double sum = 0;

    for (int term = 0;; term++) {

      int p = 2 * term + 1;

      double power = 1;
      for (int i = 1; i <= p; i++) {
        power *= x;
      }

      double fact = 1;
      for (int i = 1; i <= p; i++) {
        fact *= i;
      }

      int sign = (term % 2 == 0) ? 1 : -1;

      double current = sign * (power / fact);
      sum += current;

      if (Math.abs(current) < 1e-6) // -1×10⁻⁶ to 1×10⁻⁶
        break;
    }
    
    System.out.println("\nSin(" + x + "): " + sum);
    sc.close();
  }
}
