import java.util.Scanner;

public class combinations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int temp = arr[i];
            boolean found = false;
            while (temp > 0) {
                int rem = temp % 10;
                temp = temp / 10;
                if (rem % 2 == 0 || rem % 3 == 0 || rem == 0) {
                    System.out.println("Yes");
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("No");
            }
        }
    }
}