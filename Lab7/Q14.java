
import java.util.*;

public class Q14 {
  public static String decimalToOctal(int decimal) {
    if (decimal == 0)
      return "0";

    String oct = "";
    int n = decimal;
    while (n > 0) {
      int r = n % 8;
      oct = r + oct; 
      n /= 8;
    }
    return oct;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a decimal number: ");
    int dec = sc.nextInt();

    String oct = decimalToOctal(dec);
    System.out.println("Octal representation: " + oct);
    sc.close();
  }
}
