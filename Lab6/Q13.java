
import java.util.*;

public class Q13 {    
    public static int countWords(String s) {
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ' && (i == 0 || s.charAt(i - 1) == ' '))
                c++;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Words = " + countWords(s));
        sc.close();
    }
}
