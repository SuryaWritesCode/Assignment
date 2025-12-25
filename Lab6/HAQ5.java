
import java.util.*;

class Q5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String str = sc.nextLine();

    // 1. Length
    System.out.println("Length of the string: " + str.length());

    // 2. First and last character (assuming non-empty string)
    if (str.length() > 0) {
      char first = str.charAt(0);
      char last = str.charAt(str.length() - 1);
      System.out.println("First character: '" + first + "'");
      System.out.println("Last character: '" + last + "'");
    }

    // 3. Uppercase
    String upper = str.toUpperCase();
    System.out.println("String in uppercase: \"" + upper + "\"");

    // 4. Lowercase
    String lower = str.toLowerCase();
    System.out.println("String in lowercase: \"" + lower + "\"");

    // 5. Contains "Java"
    System.out.println("Does the string contain \"Java\"? " + str.contains("Java"));

    // 6. Starts with "Hello"
    System.out.println("Does the string start with \"Hello\"? " + str.startsWith("Hello"));

    // 7. Ends with "World"
    System.out.println("Does the string end with \"World\"? " + str.endsWith("World"));

    // 8. Trim leading and trailing spaces
    String trimmed = str.trim();
    System.out.println("Trimmed string: \"" + trimmed + "\"");

    // 9. Replace 'a' with '@'
    String replaced = str.replace('a', '@');
    System.out.println("String after replacing 'a' with '@': \"" + replaced + "\"");

    // 10. Substring from 3rd to 7th character (index 2 to 6 in Java)
    if (str.length() >= 7) {
      String sub = str.substring(2, 7); // end index is exclusive
      System.out.println("Substring from index 2 to 7: \"" + sub + "\"");
    } else {
      System.out.println("Substring from index 2 to 7: Not possible (string too short)");
    }

    sc.close();
  }
}
