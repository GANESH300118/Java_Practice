import java.util.Scanner;

public class GoalTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println("Error: n cannot be zero.");
            return;
        }
        int step = 0;
        int need = s - d;
        int target =need / n;

        System.out.println("Target: " + target);
    }
}