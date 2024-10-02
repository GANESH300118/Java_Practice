import java.util.*;
public class islandlife {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        int g = sc.nextInt();
        int sun=g/7;
        int d=g-sun;
        int enough = g*e;
        int max = d*n;
        int sum=0;
        if(max<enough){
            System.out.println(-1);
        }
        for(int i=1;i<=d;i++){
            sum=i*n;
            if(sum>=enough){
                System.out.println(i);
                break;
            }
        }
    }
}
