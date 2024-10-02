import java.util.*;
public class factorial {
    public static int factorial_1(int n){
        int sum=1;
        for(int i=1;i<=n;i++){
            sum*=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial_1(n));
    }
}
