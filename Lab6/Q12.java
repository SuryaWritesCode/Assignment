
import java.util.*;
public class Q12 {
  static int countVowels(String x){
    int cnt = 0;
    String v = "AEIOUaeiou"; 
    for(int i = 0; i < x.length(); i++){
      char c = x.charAt(i); 
      if(v.indexOf(c) != -1)           
        cnt++;
    }
    return cnt;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter string: ");
    String s = sc.nextLine();

    System.out.println("Total vowels are: " + countVowels(s));
    sc.close();
  }
}
