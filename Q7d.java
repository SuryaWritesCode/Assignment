
import java.util.*;
class Q7d{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter n: ");
    int n = sc.nextInt();
    
    for(int i = 0; i < n; i++){
      for(int j = 0; j < n; j++){
        if(i >= j)
          System.out.print((char)('A' + j));;
      }
      System.out.println();
    }

    sc.close();
  }
}