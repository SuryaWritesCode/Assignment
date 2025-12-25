
public class Q9 {
    public static int reverse(int number) {
        int rev = 0;
        while (number > 0) {
            rev = rev * 10 + number % 10;
            number /= 10;
        }
        return rev;
    }

    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        if (isPalindrome(n))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
        
        sc.close();
    }
}
