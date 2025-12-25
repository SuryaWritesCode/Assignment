
import java.util.*;

public class Q4 {
    public static double min(double[] array) {
        double m = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < m) 
                m = array[i];
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] a = new double[10];

        System.out.println("Enter ten numbers:");
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextDouble();
        }

        double ans = min(a);
        System.out.println("The minimum number is: " + ans);
        sc.close();
    }
}
