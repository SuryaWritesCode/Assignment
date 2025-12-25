
import java.util.*;
class Q3{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter n: ");
    int n = sc.nextInt();

    int temp = n;
    int sum = 0;

    while(temp > 0){
      int ld = temp % 10;
      int fact = 1;
      for(int i = 1; i <= ld; i++){
        fact *= i;
      }
      sum += fact;
      temp /= 10;
    }

    if(sum == n)
      System.out.println("It's a strong number");
    else
      System.out.println("It's not a strong number");

    sc.close();
  }
}
