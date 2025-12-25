
import java.util.*;

public class Q5 {
  static int findSecondMax(int[] arr) {
    if (arr.length < 2)
      return -1;
    
    int max = Integer.MIN_VALUE;
    int sec = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        sec = max;
        max = arr[i];
      } else if (arr[i] > sec && arr[i] != max)
        sec = arr[i];
    }
    return sec;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter size of array: ");
    int n = sc.nextInt();

    int[] arr = new int[n];

    System.out.print("Enter " + n + " integers: ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int sec = findSecondMax(arr);

    System.out.println("Second max element is: " + sec);
    sc.close();
  }
}
