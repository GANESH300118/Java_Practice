import java.util.Scanner;
public class Zandar {
    public static void solution(long a, long b, long n) {
        for (long i = 0; i * a <= n; i++) {
            if ((n - (i * a)) % b == 0) {
                System.out.print((n - (i * a)) / b + " ");
                return;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long t = scanner.nextLong();
        long[][] inputs = new long[(int) t][3];
        for (int i = 0; i < t; i++) {
            inputs[i][0] = scanner.nextLong();
            inputs[i][1] = scanner.nextLong();
            inputs[i][2] = scanner.nextLong(); 
        }
        scanner.close();
        for (int i = 0; i < t; i++) {
            solution(-1 * inputs[i][1], inputs[i][2], inputs[i][0]);
        }
    }
}
