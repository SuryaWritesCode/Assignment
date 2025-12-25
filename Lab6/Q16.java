
import java.util.*;
public class Q16 {
  static boolean isValid(String x){
    if(x.length() < 8)
      return false;

    int digits = 0;

    for(int i = 0; i < x.length(); i++){
      char c = x.charAt(i);
      if(!Character.isLetterOrDigit(c))
        return false;
      if(Character.isDigit(c))
        digits++;
    }
    return digits >= 2;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter password: ");
    String pass = sc.nextLine();

    if(isValid(pass))
      System.out.println("Password is valid");
    else
      System.out.println("Password is not valid");

    sc.close();
  }
}
