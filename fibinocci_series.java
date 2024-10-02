import java.util.*;
public class fibinocci_series {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=0,b=1,c=0;
        int n=sc.nextInt();
        if(n>0){
            System.out.print(a+" ");
            System.out.print(b+" ");
            for(int i=2;i<n;i++){
                c=a+b;
                a=b;
                b=c;
                System.out.print(c+" ");
            }
        }
    }
}