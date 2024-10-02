import java.util.*;

public class Main_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        printInvertedPyramid(rows);
    }
    public static void printInvertedPyramid(int rows) {
        for (int i = rows; i > 0; i--) {
            for (int j = 0; j < rows - i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("* ");
			}
            System.out.println();
        }
    }
}