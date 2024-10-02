import java.util.*;

public class hike_trial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findPeak(arr, n));
    }

    public static int findPeak(int[] arr, int n) {
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if ((mid == 0 || arr[mid - 1] <= arr[mid]) &&
                (mid == n - 1 || arr[mid + 1] <= arr[mid])) {
                return arr[mid];
            }
            if (mid < n - 1 && arr[mid + 1] > arr[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}