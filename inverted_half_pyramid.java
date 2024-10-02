import java.util.*;
public class inverted_half_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int z = n;
        for(int i=0;i<n;i++,z--){
            for(int j=1;j<=z;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
