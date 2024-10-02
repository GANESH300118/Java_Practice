import java.util.*;
public class binomial_coefficient {
    public static int factorial_1(int n){
        int sum=1;
        for(int i=1;i<=n;i++){
            sum*=i;
        }
        return sum;
    }
    public static int bincoeff(int n, int r){
        int n_fact = factorial_1(n);
        int r_fact = factorial_1(r);
        int nmr_fact = factorial_1(n-r);
        int ans = n_fact/(r_fact*nmr_fact);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(bincoeff(n, r));
    }
}
