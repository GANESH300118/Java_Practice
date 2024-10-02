import java.util.*;
public class max_pair_product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int maxproduct = 0;
        int num1 = -1, num2 = -1;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int sum = arr[i] + arr[j];
                if(sum == 18){
                    int product = arr[i]*arr[j];
                    if(product>maxproduct){
                        maxproduct = product;
                        num1 = arr[i];
                        num2 = arr[j];
                    }
                }
            }
        }
        if(num1 != -1 &&num2 != -1){
            if(num1 < num2){
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }
            System.out.println("[" + num1 + "," + num2 + "]");
        }
        else{
            System.out.println("No valid pairs not found");
        }
    }
}
