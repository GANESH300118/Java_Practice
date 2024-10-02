
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        
        System.out.println(countUniqueSubstrings(s));
    }

    private static int countUniqueSubstrings(String s) {
        Set<String> substrings = new HashSet<>();
        int n = s.length();
        
        // Generate all substrings
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < n; j++) {
                sb.append(s.charAt(j));
                substrings.add(sb.toString());  // Add the new substring
            }
        }
        
        return substrings.size();
    }
}
