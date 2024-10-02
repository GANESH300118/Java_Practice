import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i=0;i<=n;i++){
            arr[i] = 1;
        }
        for(int i=2;i<=n;i++){
            if(arr[i]==1){
                int j = 2;
                while(i*j<=n){
                    arr[i*j] = 0;
                    j=j+1;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(arr[i] == 1){
                System.out.println(i);
            }
        }
    }
}
