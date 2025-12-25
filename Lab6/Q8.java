
import java.util.*;
public class Q8 {
  static int largestDigit(int n){
    int max = -1;   
    while(n > 0){ 
      int ld = n % 10;   
      if(ld > max)
        max = ld;
      n/=10;
    }
    return max;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n: ");
    int n = sc.nextInt();

    System.out.println("Largest digit: " + largestDigit(n));
    sc.close();
  }
}
