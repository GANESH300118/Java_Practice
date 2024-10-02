import java.util.*;
public class CadburyDistribution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min_length = scanner.nextInt();
        int max_length = scanner.nextInt();
        int min_width = scanner.nextInt();
        int max_width = scanner.nextInt();
        int totalChildren = 0;
        for (int length = min_length; length <= max_length; length++) {
            for (int width = min_width; width <= max_width; width++) {
                totalChildren += distributeCadbury(length, width);
            }
        }
        System.out.println(totalChildren);
    }
    public static int distributeCadbury(int length, int width) {
        int totalChildren = 0;
        while (length > 0 && width > 0) {
            int minPiece = Math.min(length, width);
            totalChildren++;
            if (length != width) {
                if (length > width) {
                    length -= minPiece;
                } else {
                    width -= minPiece;
                }
            } else {
                break;
            }
        }
        return totalChildren;
    }
}