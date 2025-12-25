
import java.util.*;
class Q5{
  static int collatzLength(int n){
    int cnt = 0;
    while(n != 1){
      if(n % 2 == 0)
        n /= 2;
      else 
        n = 3*n + 1;
      cnt++;
    }
    return cnt;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n: ");
    int n = sc.nextInt();

    System.out.println("Collatz length is: " + collatzLength(n));

    sc.close();
  }
}