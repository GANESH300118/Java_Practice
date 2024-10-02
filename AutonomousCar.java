import java.util.*;
public class AutonomousCar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        int[] f = new int[testCases];
        int[] b = new int[testCases];
        int[] time = new int[testCases];
        int[] distance = new int[testCases];
        int[] output = new int[testCases];
        
        for (int i = 0; i < testCases; i++) {
            f[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
            time[i] = scanner.nextInt();
            distance[i] = scanner.nextInt();
            if (b[i] <= f[i]) {
                System.out.println("Cannot park");
                return;
            }
        }        
        for (int i = 0; i < testCases; i++) {
            if (b[i] >= distance[i]) {
                output[i] = distance[i] * time[i];
            } else {
                int totalTime = 0;
                while (b[i] < distance[i]) {
                    totalTime += (b[i] + f[i]);
                    distance[i] -= (b[i] - f[i]);
                }
                totalTime += distance[i];
                output[i] = totalTime * time[i];
            }
        }        
        for (int i = 0; i < testCases; i++) {
            if (output[i] == 0) {
                System.out.println("Invalid test case");
            } else {
                System.out.println(output[i]);
            }
        }        
        scanner.close();
    }
}