import java.util.*;
public class HappyElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int happyCount = 0;
        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (Math.abs(arr[mid] - arr[i]) <= k && arr[mid] != arr[i]) {
                    happyCount++;
                    break;
                } else if (arr[mid] <= arr[i] + k) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        System.out.println(happyCount);
        scanner.close();
    }
}
