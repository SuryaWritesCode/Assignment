
import java.util.*;
class Q6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter n: ");
    int n = sc.nextInt();
    
    double total = 0;
    for (int i = 1; i <= n; i++) {
      total += 1.0 / (i * i);  
    }

    System.out.println("Sum is: " + total);

    sc.close();
  }
}
