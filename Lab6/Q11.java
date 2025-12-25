
import java.util.*;

public class Q11 {
    public static int count(String str, char a) {
        int c = 0;
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == a)
                c++;
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch = sc.next().charAt(0);
        System.out.println(
                "Occurrences = " + count(s, ch) + (count(s, ch) > 0 ? " times" : " time"));

        sc.close();
    }
}
