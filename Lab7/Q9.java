
import java.util.*;

public class Q9 {

  public static void bubbleSort(double[] arr) {
    int n = arr.length;

    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
          double temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    double[] a = new double[10];

    System.out.println("Enter 10 numbers:");
    for (int i = 0; i < 10; i++) {
      a[i] = sc.nextDouble();
    }

    bubbleSort(a);

    System.out.println("Sorted numbers:");
    for (int i = 0; i < 10; i++) {
      System.out.print(a[i] + " ");
    }

    sc.close();
  }
}
