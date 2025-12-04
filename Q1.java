// USING LOOPS

import java.util.*;

public class Q1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter n: ");
    int n = sc.nextInt();

    int c1 = 0;
    for (int i = 1; i <= n; i++) {
      if (n % i == 0)
        c1++;
    }

    int temp = n;
    int rev = 0;

    while (temp > 0) {
      int d = temp % 10;
      rev = rev * 10 + d;
      temp /= 10;
    }

    int c2 = 0;
    for (int i = 1; i <= rev; i++) {
      if (rev % i == 0)
        c2++;
    }
    if (c1 == 2 && c2 == 2)
      System.out.println("It's a Twisted prime");
    else
      System.out.println("Not a twisted prime number");

    sc.close();
  }
}

// Using function

// import java.util.*;
// class Q1 {
// // PRIME CHECK
// static boolean isPrime(int n) {
// if (n < 2)
// return false;
// for (int i = 2; i < n; i++) {
// if (n % i == 0)
// return false;
// }
// return true;
// }

// // REVERSE
// static int reverse(int n) {
// int rev = 0;
// while (n > 0) {
// rev = rev * 10 + (n % 10);
// n /= 10;
// }
// return rev;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// System.out.print("Enter n: ");
// int n = sc.nextInt();
// int reverseNum = reverse(n);
// if (isPrime(n) && isPrime(reverseNum))
// System.out.println("It's a Twisted prime");
// else
// System.out.println("Not a twisted prime number");

// sc.close();
// }
// }