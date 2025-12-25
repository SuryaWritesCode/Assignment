
import java.util.*;

class Q3 {
  static void readArray(int[] arr) {
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < 10; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
  }

  static int count(int[] arr, int num) {
    int cnt = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == num)
        cnt++;
    }
    return cnt;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] arr = new int[10];
    System.out.print("Enter 10 integers: ");
    readArray(arr);

    System.out.print("Enter the number to search: ");
    int key = sc.nextInt();

    int c = count(arr, key);

    if (c == 0)
      System.out.println("The number " + key + " is not in the array.");
    else
      System.out.println("The number " + key + " appears " + c + " time(s) in the array.");

    sc.close();
  }
}