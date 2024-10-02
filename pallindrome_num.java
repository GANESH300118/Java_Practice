import java.util.*;
public class pallindrome_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0,rem;
        int temp=n;
        while(temp>0){
            rem = temp%10;
            rev =rev*10+rem;
            temp = temp/10;
        }
        if(temp == rev){
            System.out.println("Pallindrome");
        }
        else{
            System.out.println("Not Pallindrome");
        }
    }
}
