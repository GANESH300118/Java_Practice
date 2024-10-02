import java.util.*;
public class dec_to_bin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int binary = 0;
        int pow = 0;
        while(n>0){
            int rem = n%2;
            binary += rem*(int)Math.pow(10,pow);
            pow++;
            n/=2;
        }
        System.out.println(binary);
    }
}
