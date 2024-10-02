import java.util.*;
public class minimum_unit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int total=0;
        int m=p/100;
        int rm=p%100;
        int n=(int)Math.ceil((double)rm/4);
        total=(m*x)+(n*y);
        System.out.println(total);
    }
}