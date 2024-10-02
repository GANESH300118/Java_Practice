import java.util.*;

public class pallindrome_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] a = str.toCharArray();
        int i = 0, j = a.length - 1;
        boolean flag = false;
        while (i <= j) {
            if (a[i] != a[j]) {
                flag = true;
                break;
            }
            i++;
            j--;
        }
        if (flag) {
            System.out.println("not palindrome");
        } else {
            System.out.println("palindrome");
        }
    }
}
