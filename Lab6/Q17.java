
import java.util.*;
public class Q17 {

    static String getMiddle(String s) {
        int n = s.length();
        if (n % 2 == 1) 
            return "" + s.charAt(n / 2);    
        else 
            return "" + s.charAt(n / 2 - 1) + s.charAt(n / 2); 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.println("Middle: " + getMiddle(s));

        sc.close();
    }
}
