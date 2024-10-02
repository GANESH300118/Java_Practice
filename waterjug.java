import java.util.Scanner;

public class waterjug {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if (z > x + y) {
            System.out.println("No");
        } else if (z % gcd(x, y) == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}