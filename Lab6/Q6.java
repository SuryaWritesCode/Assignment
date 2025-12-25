
import java.util.*;
public class Q6 {
  static double divisorSum(int x){
    int sum = 0;
    for(int i = 1; i <= x/2; i++){
      if(x%i == 0)
        sum += i;
    }
    return sum;
  }
  static boolean friendlyPair(int m , int n){
    double a = divisorSum(m) / (double)m;
    double b = divisorSum(n) / (double)n;

    return a == b;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter m: ");
    int m = sc.nextInt();
    System.out.print("Enter n: ");
    int n = sc.nextInt();

    if(friendlyPair(m,n))
      System.out.println("m and n are friendly pair");
    else
      System.out.println("m and n are not friendly pair");

    sc.close();
  }
}
