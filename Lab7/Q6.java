
import java.util.*;

public class Q6 {

    // Read array elements
    public static void readArray(int[] arr) {
      Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
    }

    // Find maximum value
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    // Find minimum value
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }

    // Count how many times value occurs
    public static int countOccurrences(int[] arr, int value) {
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value)
                c++;
        }
        return c;
    }

    // First position (1-based) of max
    public static int firstPositionOfMax(int[] arr, int value) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == value) {
            return i + 1;   // 1-based index
        }
    }
    return -1;
}

    // Last position (1-based) of min
    public static int lastPositionOfMin(int[] arr, int value) {
    for (int i = arr.length - 1; i >= 0; i--) {
        if (arr[i] == value) {
            return i + 1;   // 1-based index
        }
    }
    return -1;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " values:");
        readArray(arr);

        int max = findMax(arr);
        int min = findMin(arr);
        int maxCount = countOccurrences(arr, max);
        int minCount = countOccurrences(arr, min);
        int firstMaxPos = firstPositionOfMax(arr, max);
        int lastMinPos = lastPositionOfMin(arr, min);

        System.out.println("\nMaximum value: " + max);
        System.out.println("It occurs " + maxCount + " time(s)");
        System.out.println("First position of maximum: " + firstMaxPos);

        System.out.println("\nMinimum value: " + min);
        System.out.println("It occurs " + minCount + " time(s)");
        System.out.println("Last position of minimum: " + lastMinPos);

        sc.close();
    }
}
