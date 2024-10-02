import java.util.Scanner;

public class letters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char f = Character.toUpperCase(s.charAt(0));
        char l = Character.toUpperCase(s.charAt(s.length()-1));
        System.out.println(f + "." + l);
    }
}