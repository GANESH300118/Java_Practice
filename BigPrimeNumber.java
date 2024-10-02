import java.util.*;

public class BigPrimeNumber {
    public static int findKthNumber(int n, int[] primes, int k) {
        // Min-heap (priority queue) to store the numbers
        PriorityQueue<Long> heap = new PriorityQueue<>();
        // Set to track unique numbers added to the heap
        Set<Long> seen = new HashSet<>();


        for (int prime : primes) {
            heap.add((long) prime);
            seen.add((long) prime);
        }

        long currentNumber = 1;
        for (int i = 0; i < k; i++) {
            currentNumber = heap.poll();

        
            for (int prime : primes) {
                long newNumber = currentNumber * prime;

            
                if (!seen.contains(newNumber)) {
                    heap.add(newNumber);
                    seen.add(newNumber);
                }
            }
        }

        return (int) currentNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(findKthNumber(n, arr, k));
    }
}
