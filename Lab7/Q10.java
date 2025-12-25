
import java.util.*;
                    
public class Q10 {

  public static int removeDuplicates(int[] arr, int[] result) {
    int k = 0; // index for result[]

    for (int i = 0; i < arr.length; i++) {

      int found = 0;

      // check if arr[i] already in result[]
      for (int j = 0; j < k; j++) {
        if (arr[i] == result[j]) {
          found = 1;
          break;
        }
      }

      // if not found, store it
      if (found == 0) {
        result[k] = arr[i];
        k++;
      }
    }

    return k; // number of unique elements stored
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int[] arr = new int[10];
    int[] result = new int[10];

    System.out.println("Enter 10 numbers:");
    for (int i = 0; i < 10; i++) {
      arr[i] = sc.nextInt();
    }

    int size = removeDuplicates(arr, result);

    System.out.println("Array after removing duplicates:");
    for (int i = 0; i < size; i++) {
      System.out.print(result[i] + " ");
    }
    sc.close();
  }
}
