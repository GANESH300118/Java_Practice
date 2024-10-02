import java.util.*;
public class add_elemnet_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int ele = sc.nextInt();
        int pos = sc.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[n+1];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<pos;i++){
            arr1[i]=arr[i];
        }
        arr1[pos]=ele;
        for(int i=pos;i<n;i++){
            arr1[i+1]=arr[i];
        }
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
