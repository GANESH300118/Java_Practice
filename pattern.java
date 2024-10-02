import java.util.*;
import java.io.*;
public class pattern {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n;
        n=sc.nextInt();
        char ch = 'A';
        for(int i=0;i<=n;i++)
        {
            for(int k=1;k<=i;k++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
