
public class Q2 {
  static int countDigit(int n) {
    int count = 0;
    while (n > 0) {
      n /= 10;
      count++;
    }
    return count; 
  }

  static boolean isArmstrong(int n) {
    int temp = n;
    int sum = 0;
    while (temp > 0) {
      int ld = temp % 10;
      sum += Math.pow(ld, countDigit(n));
      temp /= 10;
    }
    return sum == n;
  }

  public static void main(String[] args) {

    int cnt = 0;
    for (int i = 100; i <= 10000; i++) {
      if (isArmstrong(i)){
        System.out.println(i);
        cnt++;
      }
    }
    System.out.println("Total Armstrong numbers are: " + cnt);

  }
}
