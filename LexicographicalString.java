import java.util.*;

public class LexicographicalString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testNumb = scanner.nextInt();
        scanner.nextLine(); 
        ArrayList<String> givenOrderArr = new ArrayList<>();
        ArrayList<String> givenStrArr = new ArrayList<>();
        for (int i = 0; i < testNumb; i++) {
            givenOrderArr.add(scanner.nextLine());
            givenStrArr.add(scanner.nextLine());
        }
        ArrayList<String> sortedStrArr = new ArrayList<>();
        for (int i = 0; i < testNumb; i++) {
            sortedStrArr.add(sortBySpecificOrder(givenStrArr.get(i), givenOrderArr.get(i)));
        }
        for (String str : sortedStrArr) {
            System.out.println(str);
        }
        scanner.close();
    }
    public static String sortBySpecificOrder(String myStr, String myOrder) {
        char[] chars = myStr.toCharArray();
        char[] orderChars = myOrder.toCharArray();
        int[] indices = new int[256];
        for (int i = 0; i < orderChars.length; i++) {
            indices[orderChars[i]] = i;
        }
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (indices[chars[i]] > indices[chars[j]]) {
                    char temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
            }
        }
        return new String(chars);
    }
}
