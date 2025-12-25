
import java.util.*;

public class Q15 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int[] arr = new int[10];

    System.out.println("Enter 10 numbers:");
    for (int i = 0; i < 10; i++) {
      arr[i] = sc.nextInt();
    }

    int j = arr.length - 1;

    for (int i = arr.length - 1; i >= 0; i--) {
      if (arr[i] != 0) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        j--;
      }
    }

    System.out.println("Array after moving zeros to beginning:");
    for (int i = 0; i < 10; i++) {
      System.out.print(arr[i] + " ");
    }

    sc.close();
  }
}
