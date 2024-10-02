import java.util.*;
public class bin_to_dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number");
        int n = sc.nextInt();
        int pow = 0;
        int decimal = 0;
        while(n>0){
            int rem = n%10;
            decimal = decimal + (rem * (int)Math.pow(2,pow));
            pow++;
            n=n/10;
        }
        System.out.println(decimal);
    }
}
