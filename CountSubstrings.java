import java.util.Scanner;

public class CountSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        System.out.print("Enter the character to count substrings: ");
        char c = sc.next().charAt(0);
        int totalSubstrings = 0;
        int currentCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                currentCount++;
            } else {
                totalSubstrings += (currentCount * (currentCount + 1)) / 2;
                currentCount = 0;
            }
        }
        totalSubstrings += (currentCount * (currentCount + 1)) / 2;
        System.out.println(totalSubstrings);
    }
}