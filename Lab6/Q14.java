
import java.util.*;

public class Q14 {
    public static String toTitleCase(String s) {
        String r = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (i == 0 || s.charAt(i - 1) == ' '){
              ch = (char)(ch - 32);
            }
            r += ch;    
        }
        return r;       
    }     

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toLowerCase();
        System.out.println("Converted: " + toTitleCase(s));
        sc.close();
    }
}
