
import java.util.*;
public class Q2 {
  static void readInput(int[] arr){
    Scanner sc = new Scanner(System.in);
    while(true){
      int x = sc.nextInt();
      if(x == 0) break;
      if(x >= 1 && x <= 100)
        arr[x]++;
    }
    sc.close();
  }

  static void displayCounts(int[] arr){
    for(int i = 1; i <= 100; i++){
      if(arr[i] > 0)
        System.out.println(i + " Occurs " + arr[i] + ((arr[i] > 1) ? " times" : " time"));
    }
  }
  public static void main(String[] args) {
    int[] count = new int[101];
    readInput(count);
    displayCounts(count);
  }
}
