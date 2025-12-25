
import java.util.*;
class Q2{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter n1: ");
    int n1 = sc.nextInt();
    System.out.print("Enter n2: ");
    int n2 = sc.nextInt();

    int sum1 = 0;
    for(int i = 1; i <= n1/2 ; i++){
      if(n1 % i == 0)
        sum1 += i;
    }

    int sum2 = 0;
    for(int i = 1; i <= n2/2 ; i++){
      if(n2 % i == 0)
        sum2 += i;
    }

    if (sum1 == n2 && sum2 == n1)
      System.out.println("Numbers are amicable");
    else
      System.out.println("Numbers are not amicable");

    sc.close();
  }
}