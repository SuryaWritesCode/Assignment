
import java.util.*;
public class Q4 {

    public static double area(int n, double side) {
        return (n * side * side) / (4 * Math.tan(Math.PI / n));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double s = sc.nextDouble();
        System.out.println(area(n, s));
                                                     
        sc.close();
    }
}
