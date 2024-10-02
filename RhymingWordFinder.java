import java.util.Scanner;

public class RhymingWordFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        sc.nextLine();

        String[] d = new String[n];
        for (int i = 0; i < n; i++) {
            d[i] = sc.nextLine();
        }

        System.out.println(findrhyming(s,d,n));
    }
    public static String findrhyming(String s, String[] d, int n){
        String answer = "No Word";
        int maxcommonchars=0;
        for(int i=0;i<n;i+++){
            if(!s.equals(d[i])){
                int commonchars = commcharsatend(s,d[i]);
                if(commonchars>maxcommonchars){
                    maxcommonchars=
                }
            }
        }
    }
    private static int commonele(String s, String d){

    }
}