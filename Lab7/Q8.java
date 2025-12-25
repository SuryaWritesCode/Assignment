
import java.util.*;

public class Q8 {
    public static void fillArray(int[] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(29) + 2; // 2 to 30
        }
    }

    public static void printArray(int[] arr) {
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static int countPrimes(int[] arr) {
        int c = 0;
        for (int x : arr) if (isPrime(x)) c++;
        return c;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];

        fillArray(arr);
        System.out.print("Array elements: ");
        printArray(arr);

        int primes = countPrimes(arr);
        System.out.println("Number of prime numbers in the array: " + primes);
    }
}
