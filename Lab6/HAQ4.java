
import java.util.*;

class Q4 {
  public static void countCharacters(String str) {
    int upper = 0, lower = 0, digit = 0, special = 0;

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);

      if (Character.isUpperCase(ch))
        upper++;
      else if (Character.isLowerCase(ch))
        lower++;
      else if (Character.isDigit(ch))
        digit++;
      else
        special++;
    }

    System.out.println("Uppercase letters: " + upper);
    System.out.println("Lowercase letters: " + lower);
    System.out.println("Digits: " + digit);
    System.out.println("Special characters: " + special);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String s = sc.nextLine();

    countCharacters(s);

    sc.close();
  }
}
