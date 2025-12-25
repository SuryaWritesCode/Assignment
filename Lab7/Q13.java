
import java.util.*;

public class Q13 {
  public static void fillArray(int[] arr) {
    Random rand = new Random();
    for (int i = 0; i < arr.length; i++) {
      arr[i] = rand.nextInt(51) + 50; // 50 to 100
    }
  }

  public static void printArray(int[] arr) {
    for (int x : arr)
      System.out.print(x + " ");
    System.out.println();
  }

  public static void reverseArray(int[] arr) {
    int i = 0, j = arr.length - 1;
    while (i < j) {
      int t = arr[i];
      arr[i] = arr[j];
      arr[j] = t;
      i++;
      j--;
    }
  }

  public static void main(String[] args) {
    int[] arr = new int[10];

    fillArray(arr);

    System.out.println("Original array:");
    printArray(arr);

    reverseArray(arr);

    System.out.println("Reversed array:");
    printArray(arr);
  }
}
