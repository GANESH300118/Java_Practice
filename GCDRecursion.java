import java.util.Scanner;

public class GCDRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = gcd(a, b);
        System.out.println("GCD of " + a + " and " + b + " is: " + result);
    }
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}