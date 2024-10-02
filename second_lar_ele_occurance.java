import java.util.*;
public class second_lar_ele_occurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max1=0;
        int max2=0;
        int count=0;
        if(n<2){
            System.out.println(0);
        }
        else{
            for(int i=0;i<n;i++){
                if(arr[i]>max1){
                    max2=max1;
                    max1=arr[i];
                }
                else if(arr[i]>max2){
                    max2=arr[i];
                }
            }
            for(int i=0;i<n;i++){
                if(arr[i] == max2){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
