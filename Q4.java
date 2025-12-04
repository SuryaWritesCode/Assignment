
import java.util.*;
class Q4{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter n1: ");
    int n1 = sc.nextInt();
    System.out.print("Enter n2: ");
    int n2 = sc.nextInt();

    int maxCount = 0;
    int ans = -1;

    for(int i = n1; i <= n2; i++){
      int count = 0;
      for(int j = 1; j <= i; j++){
        if(i % j == 0)
          count++;
      }
      if(count > maxCount){
        maxCount = count;
        ans = i;
      }
    }
    System.out.println(ans + " has highest divisors i.e: " + maxCount);

    sc.close();
  }
}