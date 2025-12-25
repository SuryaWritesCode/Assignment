
import java.util.*;
class Q1{
  static int findSum(int[] arr){
    int sum = 0;
    for(int i = 0; i < arr.length; i++){
      sum += arr[i];
    }
    return sum;
  }
  static double findAverage(int[] arr){
    return findSum(arr) / arr.length;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random r = new Random();

    System.out.print("Enter n: ");
    int n = sc.nextInt();

    int[] arr = new int[n];

    System.out.print("Random values stored in the array: ");
    for(int i = 0; i < n; i++){
      arr[i] = r.nextInt(50)+1;
      System.out.print(arr[i] + " ");
    }
    
    int sum = findSum(arr);
    double average = findAverage(arr);

    System.out.println("Sum is: " + sum);
    System.out.println("Average is: " + average);

    sc.close();
  }
}