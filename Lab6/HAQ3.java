
import java.util.*;

class Q3 {
  public static int countSpaces(String str) {
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == ' ')
        count++;
    }
    return count;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String s = sc.nextLine();

    int spaces = countSpaces(s);
    System.out.println("Number of spaces in the string: " + spaces);

    sc.close();
  }
}
