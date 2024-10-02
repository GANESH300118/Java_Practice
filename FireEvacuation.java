import java.util.*;

public class FireEvacuation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;
        int sum = 0;

        // Input the array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        while (true) {
            int max = 0;
            int maxIndex = -1;

            // Find the maximum value and its index in the array
            for (int i = 0; i < n; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                    maxIndex = i;
                }
            }

            // If the maximum is 0, then all elements are 0, break the loop
            if (max == 0) {
                break;
            }

            // Set the value of the max element to 0 and count it
            for(int i=maxIndex;i<n;i++){
                arr[i] = 0;
                count++;
            }
        }

        System.out.println(count);
    }
}